(ns clojure-language-server.core
    )

(enable-console-print!)

(println "Hello world!")

(defn hello [] 
    "world from clojurejs")
(aset js/exports "hello" hello)
