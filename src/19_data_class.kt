data class Point(val x: Int, val y: Int)

fun main() {
  val p1 = Point(5, 4)
  val p2 = p1.copy()

  println(p1)
  println(if (p1 == p2) "same" else "not same")

  val (x, y) = p1
  println("$x:$y")
}
