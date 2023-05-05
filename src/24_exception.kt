class MyException(message: String): Throwable(message)

fun div(a: Int, b: Int) {
  try {
    if (b < 0) {
      throw MyException("Not minus")
    }
    println(a / b)
  } catch (e: ArithmeticException) {
    println(e.message)
  } catch (e: MyException) {
    println(e.message)
  } finally {
    println("----- end -----")
  }
}

fun main() {
  div(3, 0)
  div(3, -1)
  div(3, 3)
}
