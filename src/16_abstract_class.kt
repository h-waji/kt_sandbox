abstract class Department {
  abstract fun printInfo()
}

class Developer: Department() {
  override fun printInfo() {
    println("DEVELOPER")
  }
}

class Sales: Department() {
  override fun printInfo() {
    println("SALES")
  }
}

fun main() {
  val dev = Developer()
  dev.printInfo()
  val sales = Sales()
  sales.printInfo()
}
