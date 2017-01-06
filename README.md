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
- [x] [Tokenizer](https://github.com/ziyasal/sky/blob/master/src/main/scala/lib/Tokenizer.scala)  
- [x] [Parser](https://github.com/ziyasal/sky/blob/master/src/main/scala/lib/Parser.scala)
- [ ] Transformer
- [ ] CodeGen
- [ ] Compiler

## Step-By-Step Guide ##
TODO:
