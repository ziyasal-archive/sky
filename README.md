sky
==========
> Super simple programming language and tiny compiler developed for educational purpose in Scala

## Motivation ##
Coding4fun, just trying to simplify how compilers work for who has interest

## How it works
Compilers(mostly) have 3 primary stages; 

**Parsing**
 - Lexical Analysis
 - Syntactic Analysis

**Transformation**  
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
//TODO:
```

## Links ##
- [Tokenizer](https://github.com/ziyasal/sky/blob/master/src/main/scala/lib/Tokenizer.scala)  
**TODO:**
- [Parser](https://github.com/ziyasal/sky/blob/master/src/main/scala/Parser.scala)
- [Transformer](https://github.com/ziyasal/sky/blob/master/src/main/scala/Transformer.scala)
- [CodeGen](https://github.com/ziyasal/sky/blob/master/src/main/scala/GodeGenerator.scala)
- [Compiler](https://github.com/ziyasal/sky/blob/master/src/main/scala/Compiler.scala)

## Step-By-Step Guide ##
TODO:
