fun main() {
  val numbers: List<Int> = listOf(20, 30, 40)
  println(numbers[1])

  val numbers2 = listOf(50, 60, 70)
  println(numbers2[0])

  val numbers3 = mutableListOf(111, 222, 333)
  numbers3[1] = 0
  println(numbers3.size)

  for (number in numbers3) {
    println(number)
  }
}
