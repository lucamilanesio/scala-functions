object PartiallyApplied extends App {

  def sum = (_: Int) + (_: Int)

  val increment = sum(_, 1)

  println(s"sum(10,1) = ${sum(10, 1)}")
  println(s"sum(_,1) = $increment")
  println(s"increment(10) = ${increment(10)}")
}
