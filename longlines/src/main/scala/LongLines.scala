import scala.io.Source

object LongLines extends App {

  def processFile(filename: String, width: Int): Unit = {

    def processLine(line: String): Unit =
      if (line.length > width) println(s"$filename : ${line.trim}")

    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(line)
  }

  processFile("longlines/src/main/resources/longlines.txt", 10)
}
