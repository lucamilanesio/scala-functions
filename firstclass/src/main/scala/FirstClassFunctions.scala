object FirstClassFunctions extends App {
  List(-10, 20, 30)
    .map(_ + 1)
    .filter(_ > 0)
    .map("x = " + _)
    .foreach(println)
}
