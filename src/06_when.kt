fun main() {
  val num = 5

  // when (num) {
  //   0 -> println("Zero")
  //   1 -> println("One")
  //   2, 3 -> println("Two or Three")
  //   in 4..10 -> println("Many") // 範囲
  //   else -> println("other")
  // }

  val result = when (num) {
    0 -> "Zero"
    1 -> "One"
    2, 3 -> "Two or Three"
    in 4..10 -> "Many" // 範囲
    else -> "other"
  }

  println(result)
}