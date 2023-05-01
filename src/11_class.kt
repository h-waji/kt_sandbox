class User {
  var name = "Nanashi"
  fun sayHello() {
    // println("Hello ${this.name}")
    println("Hello $name")
  }
}

fun main() {
  // val user: User = User()
  val user = User()
  user.sayHello()

  user.name = "Miku"
  user.sayHello()
}
