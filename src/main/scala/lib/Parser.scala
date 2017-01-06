package lib

import scala.collection.mutable.ListBuffer


/**
 *  Array<Token> -> Parser#parse -> AST
 *
 *  [{ type: 'paren', value: '(' }, ...]   =>   { type: 'Program', body: [...] }
 */

trait Expressible{

}

class Node(_type: String, name:String)
  extends Expressible {
  override def toString: String = {
    "{'type':'%s', 'name':'%s'}".format(_type, name)
  }
}

class Literal(_type: String, value:String) extends Expressible{
  override def toString: String = {
    "{'type':'%s', 'value':'%s'}".format(_type, value)
  }
}

class CallExprNode(val _type:String, val name: String, var params:List[Expressible])
  extends Node(_type, name) with Expressible{
  override def toString: String = {
    "{'type':'%s', 'name':'%s', 'params':[%s]}".format(_type, name, params)
  }
}

class Ast(val _type: String, var body:List[Expressible]) {
  override def toString: String = {
    "{'type':'%s', 'body': [%s]}".format(_type, body)
  }
}

class Parser{
  def parse(tokens:List[Token]) : Ast = {

    var current:Int = 0

    def walk (): Expressible = {

      var token = tokens(current)

      if (token._type == "number") {
        current += 1

        return new Literal(_type =  "NumberLiteral",  value= token.value)
      }

      if (token._type == "string") {
        current+=1

        new Literal( _type = "StringLiteral", value= token.value)
      }

      if (token._type == "paren" && token.value == "(") {
        current += 1
        token = tokens(current)

        val node = new CallExprNode(_type = "CallExpression", name = token.value, params = List())

        var paramsBuffer: ListBuffer[Expressible] = ListBuffer()
        current +=1
        token = tokens(current)

        while ( (token._type != "paren") || (token._type == "paren" && token.value != ")")){
          paramsBuffer +=  walk()
          token = tokens(current)
        }

        current += 1
        node.params = paramsBuffer.toList
        return node
      }

      throw new Exception(token._type)
    }


    val ast = new Ast("Program", List())
    var bodyBuffer: ListBuffer[Expressible] = ListBuffer()

    //Loop variable current updated inside of walk nested func
    while (current < tokens.length) {
      bodyBuffer += walk()
    }

    ast.body =  bodyBuffer.toList
    ast
  }

}
