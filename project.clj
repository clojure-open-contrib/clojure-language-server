(defproject clojure-language-server "0.1.0-SNAPSHOT"
  :description "a language server protocol implementation for Clojure"
  :url "https://github.com/clojure-open-contrib/clojure-language-server"
  :license {:name "MIT License"}
  :mirrors {"central" {:name "central"
                       :url "http://maven.aliyun.com/nexus/content/groups/public"}}
  :repositories {"aliyun" {:url "http://maven.aliyun.com/nexus/content/groups/public"}
                 "maven"   {:url "http://repo1.maven.org/maven2/"}}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.473"]]
                 
  :plugins [[lein-cljsbuild "1.1.5"]
            ;[lein-npm "0.6.2"]
            ]

  :hooks [leiningen.cljsbuild]

  ;:npm { :dependencies ["vscode-languageserver"  "^3.0.4"]}
    
  :cljsbuild {:builds {:main {:source-paths ["src"] 
                              :target :nodejs
                              :source-map true
                              :compiler {:output-to "client/server/clj.js"
                                         :optimizations :simple
                                         :pretty-print true}}}})
    
      
        
        
        
   
   

        
  
                                    
                                    


                        
    
      
    
        
       
