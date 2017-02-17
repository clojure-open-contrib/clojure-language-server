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
  :plugins [[lein-cljsbuild "1.1.5"]]
  :cljsbuild {}
    :builds [{}]
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {}
          :output-to "main.js"  ; default: target/cljsbuild-main.js
          :optimizations :whitespace
          :pretty-print true)
