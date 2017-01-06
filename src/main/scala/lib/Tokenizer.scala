package lib

import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

class Token(val _type:String, val value:String){

  override def toString: String = {
    "{'type':'%s', 'value':'%s'}".format(_type, value)
  }
}

/*
 (add 2 (subtract 4 2))   =>   [{ type: 'paren', value: '(' }, ...]
 */
class Tokenizer {

  private final val NUMBERS    = "[0-9]+"
  private final val LETTERS    = "[a-z]+"
  private final val WHITESPACE = "\\s"

  def tokenize(input: String): List[Token] = {

    var current: Int = 0

    var tokens: ListBuffer[Token] = ListBuffer() //Stack is deprecated so using list with `::` to push and `tail` to pop

    while (current < input.length) {

      var char = input(current)

      breakable {

        if (char == '(') {
         tokens += new Token("paren", "(")
          current += 1

          break
        }

        if (char == ')') {
          tokens += new Token("paren", ")")
          current += 1

          break
        }

        if (char.toString.matches(WHITESPACE)) {
          current += 1

          break
        }

        if (char.toString.matches(NUMBERS)) {
          var value = " "
          while (char.toString.matches(NUMBERS)) {
            value += char
            current += 1
            char = input(current)
          }

          tokens += new Token("number", value)

          break
        }

        if (char.toString.matches(LETTERS)) {
          var value = ""

          while (char.toString.matches(LETTERS)) {
            value += char
            current += 1
            char = input(current)
          }

          tokens +=  new Token("name", value)

          break
        }
      }

      //TODO: solve
      //throw new Exception(s"Char is unknown: $char")
    }

    tokens.toList
  }
}


