sky
==========
> Super simple programming language developed for educational purpose in Scala

## Motivation ##
Codign 4 fun, just trying to simplify how compilers work for who has interest

## How it works
Compilers(mostly) has 3 primary stages; 

**Parsing**
 - Lexical Analysis
 - Syntactic Analysis

** Transformation** 
Make some changes on AST

**Code Generation**
Create code from AST

```js
              /----------\      /-----------------\       /-----------------\
 /------\     |          |      |                 |       |                 |
 | Raw  |____ | Parsing  |_____ | Transformation  |______ | Code Generation | 
 | Code |     |          |      |                 |       |                 |
 \------/     \----------/      \-----------------/       \-----------------/

```

## Sample ##
```js
//sample 1
d(2 4)            // result: 2

//sample 2
m(s(4 5) 4)       //result: 36

//sample 3
d(m(8 3) s(5 1))  //result: 3
```

## Links ##
- [Lexer](https://github.com/ziyasal/sky/blob/master/src/main/scala/Lexer.scala)
- [Parser](https://github.com/ziyasal/sky/blob/master/src/main/scala/Parser.scala)
- [Transformer](https://github.com/ziyasal/sky/blob/master/src/main/scala/Transformer.scala)
- [CodeGen](https://github.com/ziyasal/sky/blob/master/src/main/scala/GodeGenerator.scala)
- [Compiler](https://github.com/ziyasal/sky/blob/master/src/main/scala/Compiler.scala)

## Documentation ##
TODO:
