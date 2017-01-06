import lib._

object App {
  def main(args: Array[String]): Unit = {

    val tokenizer = new Tokenizer()
    val tokens = tokenizer.tokenize("(add 2 (subtract 4 2))")

     val parser =  new Parser()
     val ast = parser.parse(tokens)

    println(ast)
    //
    // val transformer =  new Transformer()
    // val newAst = parser.transform(ast)
    //
    // val codeGen =  new CodeGenerator()
    // val code = codeGen.generate(newAst)
    //
    // println(code)

    println(tokens)
  }
}