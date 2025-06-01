package lambdas

//lambdas - anonymous functions that can be treated as data types, meaning they can be passed as arguments to other
//functions, returned from functions or assigned to variables.

fun add(num1: Int, num2: Int) : Int {
    return num1 + num2
}
fun ageDescription(age: Int) : String{
    return if (age < 18) "Child"
    else if  (age == 19) "teenager"
    else if (age in 20 .. 60) "Adult"
    else "Senior citizen"
}

val ageDescriptionAsLambda: (Int) -> String = {age: Int ->
    if (age < 18) "Child"
    else if  (age == 19) "teenager"
    else if (age in 20 .. 60) "Adult"
    else "Senior citizen"
}
//lambdas as function arguments


val addRewriteLambda: (Int, Int) ->Int = {num1: Int, num2:Int -> num1 + num2}
//lambda shorthand
val subtract: (Int, Int) -> Int = {num1, num2 -> num1 - num2 }

//lambda with one argument
val square:(Int) -> Int = { num1: Int -> num1 * num1}

///shorthand notation of lambdas with one argument
val squareShorthand:(Int) -> Int = {it * it}

val cube : (Int) -> Int = {it + it * it}
fun operateOnNumbers(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
):Int {
    val result = operation(a,b)
    println(result)
    return result
}
val addLambda = {a: Int, b: Int -> a + b}


fun main() {
    val num1 = 20
    val num2 = 30

    println("the sum of $num1 and $num2 is ${add(num1, num2)}")
    println(subtract(num2, num1))
    println("The square of $num2 is ${square(num2)}")
    println("The cube of $num1 is ${cube(num1)}")
    println(ageDescriptionAsLambda(58))
    println(operateOnNumbers(7,9 ,addLambda))



}