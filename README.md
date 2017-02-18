# clojure-language-server
Sample Clojure language server implemented in Node and Clojure

Clojure的vscode的language server，实现language server protocol

因为vscode 默认有Node,所以就不引入Java了,所以就不用clojure做服务端了. 但是可以用cljs生成js.然后 扩展里面调用.

使用的是cljs, 直接编译到 client/server/clj.js 里面.

然后, server.ts 里面 require("./clj.js") ,就可以用了

这是一个混合的玩具~ 

话说已经有了typescript了,为啥还要cljs?
