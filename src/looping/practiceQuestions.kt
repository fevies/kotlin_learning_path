package looping

//Write a function that takes a number and returns whether it is positive, negative, or zero.
fun checkNumber(number: Int): String{
    return if (number > 0) {
        "number is positive"
    } else if (number < 0) {
        "number is negative"
    }else {
        "number is zero"
    }
}
//Create a function that checks if a person is eligible to vote (age ≥ 18).
fun voter(age: Int): String {
   return if (age > 18) {
        "you are a voter"
    } else{
         "you are not a voter"
   }
}
//Given three numbers, return the largest using only if/else.
fun whichIsLarge(valueOne: Int, valueTwo:Int, valueThree: Int) : String {
    return if (valueOne > valueTwo && valueOne > valueThree) {
        "$valueOne is the largest"
    } else if (valueTwo > valueOne && valueTwo > valueThree) {
        "$valueTwo is the largest"
    } else {
        "$valueThree is the largest"
    }
}
//Write a function that returns the day name when given a number from 1 to 7.

fun dayOfTheWeek(day:Int): String {
    return when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "check your calendar"
    }

}
//Given a character, use when to check if it's a vowel, consonant, or not a letter.

fun checkVowel(character: Char) : String{
    return when (character){
       'a','e','i','o','u' -> "vowel"
        in 'a' .. 'z' -> "consonant"
       else -> "not a letter"
   }

}


fun main() {
    println(checkNumber(5))
    println(checkNumber(0))
    println(checkNumber(-9))
    println(voter(45))
    println(whichIsLarge(34,45,90))
    println(dayOfTheWeek(7))
    println(checkVowel('b'))
    println(checkVowel('a'))
    //Loop through numbers 1 to 10 and print even numbers only.
    for ( number in 1 .. 10) {
        println(number)

    }
}