object Partial extends App {

  def divided: PartialFunction[Int, Int] = {
    case div if div != 0 => 100 / div
  }

  List(10, 5, 0, 2).collect(divided).foreach(println)
}
