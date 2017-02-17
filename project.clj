(defproject clojure-language-server "0.1.0-SNAPSHOT"
  :description "a language server protocol implementation for Clojure"
  :url "https://github.com/clojure-open-contrib/clojure-language-server"
  :license {:name "MIT License"}
  :mirrors {"central" {:name "central"
                       :url "http://maven.aliyun.com/nexus/content/groups/public"}}
  :repositories {"aliyun" {:url "http://maven.aliyun.com/nexus/content/groups/public"}
                 "maven"   {:url "http://repo1.maven.org/maven2/"}}
  :main clojure-language-server.core
  :aot [clojure-language-server.core]
  :dependencies [[org.clojure/clojurescript "1.9.473"]])
