fun main() {
  val numbers: Set<Int> = setOf(5, 3, 4, 5)
  println(numbers)

  val numbers2 = setOf(10, 20, 30, 20)
  println(numbers2)

  val numbers3 = mutableSetOf(111, 222, 333, 222)
  numbers3.add(444)
  numbers3.remove(111)
  println(numbers3.contains(444))
  println(numbers3)

  val numbers4 = setOf(0, 1, 3, 5, 7, 9)
  val numbers5 = setOf(0, 2, 4, 6, 8, 9)
  println(numbers4.intersect(numbers5)) // 積集合
  println(numbers4.union(numbers5)) // 和集合
  println(numbers4.subtract(numbers5)) // 差集合
}