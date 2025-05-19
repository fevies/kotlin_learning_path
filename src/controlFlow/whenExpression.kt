package controlFlow

fun main() {

    val number = 10

//using when as an expression
    val numberName = when (number) {
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> {
            println("Unknown number")
            "unknown"
        }
    }
    val hourOfDay = 12
    val timeOfDay : String

    timeOfDay = when (hourOfDay) {

        0,1,2,3,4,5 -> "Early morning"
        6,7,8,9,10,11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19  -> "evening"
        20,21,22,23 -> "late evening"
        else -> "invalid hour"
    }
    println(timeOfDay)
    //using when with conditions
    when {
        number % 2 == 0 ->println("even")
        else -> println("odd")
    }
    val (x, y, z) = Triple(3,2,5)
    when {
        x == 0 && y == 0 && z == 0 -> println("Origin")
        y == 0 && z == 0 -> println("On the x axis at x = $x")
        x == 0 && z == 0 -> println("On the y axis at y = $y")
        x == 0 && y == 0 -> println("on the z axis at z = $z")
        else -> println("In space at x = $x , y = $y, x =$z")
    }
}