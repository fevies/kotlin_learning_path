package functions

//Define a function that takes two integers and returns their sum
fun sumOfIntegers(a:Int, b:Int): Int {
    print("The sum of two integers $a and $b is ")
    return a + b
}
//Create a function that returns the square of a number.
fun squareOfNumbers(a: Int) = a * a

//Write a function with a named argument call.
fun testName(name: String) {
    println("is your name $name , come back tomorrow")
}

//Define a function with default parameters and use it in multiple ways.
fun greet(name: String = "user" ) = "Hello $name"

//Write a function that takes a list of integers and returns the count of even numbers.
fun listOfIntegers(numbers:List<Int>) {

var sum = 0

        for (number in numbers) {
            if (number % 2 == 0) {
                println(number)
                sum += number
            }

        }
    println("The total value of even numbers is $sum")




}
fun main() {
    println(sumOfIntegers(7,8))
    println(squareOfNumbers(8))
    testName(name = "John Doe")
    println(greet())
    println(greet("alex"))
    println(listOfIntegers(listOf(2,4,5,9,18,20)))


}