class President(var name: String) {
  var wiseSaying = "hoge"
    // get() {
    //   return field.uppercase()
    // }
    get() = field.uppercase()
    set(value) {
      if (value != "") {
        field = value
      }
    }

  fun sayHi() {
    println("Hi! $wiseSaying $name")
  }
}

fun main() {
  val obama = President("Obama")
  println(obama.wiseSaying)
  obama.wiseSaying = "Yes we can!"
  println(obama.wiseSaying)
  obama.sayHi()
}
