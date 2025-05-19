package looping

fun hasChar(s: String, ch: Char): Boolean {
    for (c in s) {
        if (c == ch) return  true
    }
    return false
}
fun main() {
    for (i in 1..3) {
        println("hey $i")
    }

    var sum = 0
    for (n in 10 .. 100) {
        sum += n
    }
    println("sum = $sum")

    val s =  "abc"
    for (i in 0 .. s.lastIndex) {
        println(s[i] + 1)
    }
    println(hasChar("kotlin",'t'))
    println(hasChar("Kotlin",'a'))

}