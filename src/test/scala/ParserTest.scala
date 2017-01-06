import lib.{CallExprNode, Parser, Tokenizer}
import org.scalatest.{FlatSpec, Matchers}

class ParserTest extends FlatSpec with Matchers {

  "A Parser " should "create AST by given tokens" in {

    val tokenizer = new Tokenizer()
    val tokens = tokenizer.tokenize("(add 2 (subtract 4 2))")

    val parser = new Parser()
    val ast = parser.parse(tokens)

    val node = ast.body(1)
    node shouldBe a [CallExprNode]
  }

}