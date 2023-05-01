fun hello(name: String = "Miku", age: Int = 16) {
  println("Hello! $name ($age)")
}

fun main() {
  hello("Rin", 14)
  hello("Len", 14)
  hello()
  hello(age = 17, name = "KAFU")
}
