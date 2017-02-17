(ns clojure-language-server.core
    (:require [cljs.nodejs :as nodejs]))

(enable-console-print!)

(println "Hello world!")

(defn hello [] 
    "world")

(def vscode-ls (nodejs/require "vscode-languageserver"))
;(println vscode-ls)

(def createConnection  (aget vscode-ls "createConnection"))
(def IPCMessageReader (aget  vscode-ls "IPCMessageReader"))
(def IPCMessageWriter (aget  vscode-ls "IPCMessageWriter"))

(def connection (createConnection  (IPCMessageReader. nodejs/process)
                                   (IPCMessageWriter. nodejs/process)))

(def TextDocuments (aget  vscode-ls "TextDocuments"))

(def documents (TextDocuments.))

(.listen documents connection)


; ;After the server has started the client sends an initialize request. The server receives
; ; in the passed params the rootPath of the workspace plus the client capabilities.) 
(.onInitialize connection (fn [params]) 
    (let [workspaceRoot (aget  params "rootPath")]
        (js-obj {"capabilities" {"textDocumentSync" (aget  documents "syncKind") "completionProvider" {"resolveProvider" true}}})))

(defn validateTextDocument [textDocument] 
    (let [diagnostics (jso-obj {"severity" (aget DiagnosticSeverity "Warning" ) "range" {}  
                                "start" {"line" 1 "character" 1} end {"line" 3 "character" 1} 
                                "message" "hello world" :source "ex"})]
        (.sendDiagnostics connection (js-obj "uri" (aget textDocument "uri" ) "diagnostics" diagnostics)))) 
       
      

(.onDidChangeContent documents (fn [change] (.log nodejs/console "We received an onDidChangeContent change event")
                                            (.openTextDocument connection "file://E:/u8soft/bb.txt")
                                            (validateTextDocument (aget  change "document"))))
(.onDidChangeConfiguration connection (fn [change]) 
    (let [settings (aget change "settings")
          maxNumberOfProblems (aget   (aget  settings "languageServerExample") "maxNumberOfProblems")]
        (map validateTextDocument (.all documents))))
     
(.onDidChangeWatchedFiles connection (fn [connection] (.log connection/console "We received an file change event")))
; (def IConnection vscode-ls/IConnection)
; (def TextDocumentSyncKind vscode-ls/TextDocumentSyncKind)
; (def createConnection vscode-ls/createConnection)

    
; Listen on the connection
(.listen connection)
         
(println connection) 
