import java.lang.Integer.parseInt

object Implicit extends App {

  implicit def parseIntFromString: String => Int = parseInt

  def increment = (_: Int) + 1

  println(s"""increment("10") = ${increment("10")}""")
}
