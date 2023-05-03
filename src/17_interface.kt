interface Sharable {
  val version: Double
  fun share()
  fun getInfo() {
    println("Share I/F ver.$version")
  }
}

class SnsContent(override val version: Double): Sharable {
  override fun share() {
    println("Sharing...")
  }
}

fun main() {
  val content = SnsContent(0.1)
  content.share()
  content.getInfo();
}
