fun main() {
  var score = 85
  if (score > 80){
    println("Great!")
  } else if (score > 60) {
    println("Good")
  } else {
    println("so so ...")
  }

  var score2 = 40
  var result = if (score2 > 80) "Great" else "so so ..."
  println(result)
}
