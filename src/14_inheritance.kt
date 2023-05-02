open class Employee(var name: String) {
  open fun sayHi() {
    println("Hi! $name")
  }
}

class Engineer(name: String): Employee(name) {
  fun sayHello() {
    println("Hello! $name")
  }

  override fun sayHi() {
    println("Hi! $name")
  }
}

fun main() {
  val jobs = Engineer("Jobs")
  jobs.sayHello()
  jobs.sayHi()
}
