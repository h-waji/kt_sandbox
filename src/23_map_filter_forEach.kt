fun main() {
  val prices = listOf(30.0, 40.5, 65.8, 88.9)
  prices
    // .map { n -> n * 1.10 }
    .map { it * 1.10 }
    // .filter { n -> n > 50 }
    .filter { it > 50 }
    .forEach { println(it) }

  println(prices)
}