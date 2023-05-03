class Enemy(var name: String) {
  fun sayHi() {
    println("Hi $name")
  }
}

fun Enemy.sayHello() {
  println("Hello $name")
}

val Enemy.Hp: Int
  get() = 5

fun main() {
  val nokonoko = Enemy("Nokonoko")
  nokonoko.sayHi();
  nokonoko.sayHello();
  println(nokonoko.Hp);
}
