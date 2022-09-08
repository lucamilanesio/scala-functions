object Curried extends App {

  def sum(num1: Int)(num2: Int) = num1 + num2

  val increment = sum(1) _

  println(s"increment(10) = ${increment(10)}")
}
