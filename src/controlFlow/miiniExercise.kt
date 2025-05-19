package controlFlow



fun main() {
//Create a constant called myAge and set it to your age. Then, create a constant
//named isTeenager that uses Boolean logic to determine if the age denotes
//someone in the age range of 13 to 19
    val myAge = 20

    val isTeenager = if (myAge == 13 && myAge < 19) {
        println("you are a teenager")
    } else {
        println("You are not a teenager")
    }
    println(isTeenager)
    //Create another constant named theirAge and set it to the age 30. Then, create a
    //constant named bothTeenagers that uses Boolean logic to determine if both you
    //and them are teenagers
    val theirAge = 30
    val bothTeenagers = myAge == 13 && myAge < 19 || theirAge == 13 && theirAge < 19
    println("are you teenager: $bothTeenagers")

    //Create a constant named reader and set it to your name as a string. Create a
    //constant named author and set it to the name Richard Lucas. Create a constant
    //named authorIsReader that uses string equality to determine if reader and
    //author are equal
    val reader = "John Doe"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    println("is the author the reader: $authorIsReader")

    //Create a constant named readerBeforeAuthor which uses string comparison to
    //determine if reader comes before author
    val readerBeforeAuthor = reader < author
    println("does reader come before author $readerBeforeAuthor")
    //Write a when expression that takes an age as an integer and prints out the life
    //stage related to that age. You can make up the life stages, or use the
    //categorization as follows: 0-2 years, Infant; 3-12 years, Child; 13-19 years,
    //Teenager; 20-39, Adult; 40-60, Middle aged; 61+, Elderly

    val age = 13
    val ageCheck: String = when(age){
        in 0..2 ->"infant"
        in 3 ..12 -> "child"
        in 13 ..19 -> "teenager"
        in  20 .. 39 -> "adult"
        in 40 .. 60 -> "middle age"
        else -> "elderly"

    }
    println(ageCheck)
    //Write a when expression that destructures a Pair containing a string and an
    //integer. The string is a name, and the integer is an age. Use the same cases that
    //you used in the previous exercise to print out the name followed by the life stage.
    //For example, for myself it would print out "Joe is an adult.".

    val (name: String, ageTwo: Int) = Pair("Joe",18)
    val ageCheckTwo = when (ageTwo) {
        in 0 .. 2 -> "infant"
        in 3 ..12 -> "child"
        in 13 ..19 -> "teenager"
        in 20 .. 39 -> "adult"
        in 40 .. 60 -> "middle age"
        else -> "elderly"
    }
    println("$name is a $ageCheckTwo")
}