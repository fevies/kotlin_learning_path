package collections

//A set is an unordered collection of unique values of the same type.This is extreme useful when you want to make sure
//an item does not appear more than once in a collection, and when the order of your items is not important

//creating sets
fun main() {
    //duplicate is not included.
    val names = setOf("Anna", "Brian", "Craig", "Anna")
    println(names)

    //creating an empty set
    val hashSet = HashSet<Int> ()

    //set from arrays
    val someArray = arrayOf(1, 2, 3, 1)
    val someSet = mutableSetOf(*someArray)
    println(someSet)
}