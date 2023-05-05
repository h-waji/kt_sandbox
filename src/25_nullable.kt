fun main() {
  // val s: String = null
  val s: String? = null
  // val s: String? = "Hoge"

  // if (s != null) {
  //   println(s.length)
  // } else {
  //   println(null)
  // }
  println(s?.length)

  // エルビス演算子
  println(s?.length ?: 0)

  // 例外
  println(s!!.length) // => 危険な方法
}
