package example

object Diffmaker {
  def loadResource(infile: String): String = {
    val source = scala.io.Source.fromResource(infile)
    val lines = try source.mkString finally source.close()
    return lines
  }

  def diff(before: String, after: String) = {
    // TODO: Figure this out  
  }

  def main(args: Array[String]): Unit = {
    val before = loadResource("before.txt")
    val after = loadResource("after.txt")
    val tokenize = diff(before, after)
    println(tokenize)
  }
}
