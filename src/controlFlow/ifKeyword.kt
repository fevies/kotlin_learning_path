package controlFlow

//An if expressions is used to make a choice.
fun trueOrFalse(exp: Boolean) :String =
    if (exp)
         "It's true"
    else "its false"


fun main() {
    if (1 > 0) {
        println("It's true")
    }
    if (10 > 11) {
        println("ten is less than zero")
    }

    //using the else keyword it allows you to handle both the true and false part
    val p: Int = -11

    if (p > 0) {
        println("it's positive")
    }else {
        println("It's negative")
    }

    //the else keyword is also used in conjunction with if to test multiple combination
    val n:Int = - 11

    if (n > 0) {
        println("it's positive")
    }else if (n == 0) {
        println("It's zero")
    }else {
        println("It's negative")
    }

    val y: Boolean = false
    if (!y) {
        println("it's true")
    }

    //using if as an expression
    val num = 10
    val result = if (num > 100)4 else 42
    println(result)

    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))

}