## How to develop ?

vscode默认支持node,所以用了javascript相关的语言.
然后就来了一套,cljs 与  TypeScript 混搭开发.

client 与server 有参看 [官网Node示例](https://github.com/Microsoft/vscode-languageserver-node-example)

我只把示例里的关键字改了.

如果要使用TypeScript开发,在Server目录里面开发就好了.

如果要使用cljs开发,在src目录里面开发就好了.

`language is poor,show me your code ~`

说一下简单的开发流程~

1. `git clone https://github.com/clojure-open-contrib/clojure-language-server`

2. `cd client  && npm install`

3. `cd ../server  && npm install && npm run compile`

4. `cd ..  && lein deps`

*可能会出现tsc 找不到的情况,用这个解决`npm install -g typescript`*

#### 如果使用cljs开发,
5. `code .  `  
    这个是打开服务端
    ```Ctrl + ` ``` 开启终端,输入,`lein cljsbuild once `编译服务端代码到 `client/server/cljs.js`
6. `code client`
    这个是打开客户端, 可以在这里开启调试模式. `Ctrl + B ` 切出Debug,调试扩展.

#### 如果使用TypeScript开发,
- 直接在 code server ,直接在这里面新建ts文件.
然后 `npm run compile` 就可以了.


#### 本次更新
- 2017年2月18日00:07:52  新增HelloWorld模块. 只是为了跑通开发流程.
