package collections

//collections - are used to store or manipulate groups of objects or  data
fun main() {
    //An array is an ordered collection of values of the same type.
    val evenNumbers = arrayOf(2, 4, 6, 8)
    val fiveFives = Array(5,{5})

    //it's good practice to declare arrays that aren't going to change as constants using val
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')

    //Using primitive types over the boxed counterparts will consume less memory and result in better performance.
    val oddNumbers = intArrayOf(1, 3, 5, 7)
    val zeros = DoubleArray(4, {6.0})

    //conversion of boxed and primitive arrays using functions
    val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()

}