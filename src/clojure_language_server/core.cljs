(ns clojure-language-server.core
    (:require [cljs.nodejs :as nodejs]))

(enable-console-print!)

(println "Hello world!")

(defn hello [] 
    "world")
(aset nodejs/exports "hello" hello)
