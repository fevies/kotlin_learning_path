package classes

class Person(
    //primary constructor
    var firstName: String,
    var lastName: String) {

    //properties
    val fullName
        get() = "$firstName $lastName"
}
class SimplePerson(val name: String)

fun main() {
//creating an instance of the class - objects
    val john = Person (firstName = "Johnny" , lastName = "Appleseed")
    println(john.fullName)

    var var1 = SimplePerson (name = "John")
    var var2 = var1

    var
}