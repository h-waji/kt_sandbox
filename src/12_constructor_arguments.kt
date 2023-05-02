class Vocaloid(var name: String) {
  var song = "Vampire"

  init {
    println("instance created: $name, $song")
  }

  fun sayHi() {
    println("Hi. $name")
  }
}

fun main() {
  val miku = Vocaloid("Miku")
  println(miku.name)
  miku.sayHi()
}

