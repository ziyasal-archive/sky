import lib.Tokenizer
import org.scalatest._

class TokenizerTest extends FlatSpec with Matchers {

  "A Tokenizer" should "tokenize given code" in {
    val tokenizer = new Tokenizer()
    val tokens = tokenizer.tokenize("(add 2 (subtract 4 2))")

    tokens.length should be (9)
  }

}
