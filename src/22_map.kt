fun main() {
  val users: Map<String, Int> = mapOf("Miku" to 16, "Rin" to 14, "Len" to 14)
  println(users)

  val users2 = mapOf("Miku" to 16, "Rin" to 14, "Len" to 14)
  println(users2)

  val users3: MutableMap<String, Int> = mutableMapOf("Miku" to 16, "Rin" to 14, "Len" to 14)
  users3["Rin"] = 22
  println(users3["Rin"])
  println(users3.size)
  println(users3.keys)
  println(users3.values)
  println(users3.entries)
}
