class MyData<T> {
  fun getThree(x: T) {
    println(x)
    println(x)
    println(x)
  }
}

fun main() {
  val i = MyData<Int>()
  i.getThree(53)

  val s = MyData<String>()
  s.getThree("Hello")
}
