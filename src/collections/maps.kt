package collections

//A map - is an unordered collection of pairs , where each pair comprises a key and a value, returns an immutable map
//of fixed size
fun main() {
    //An example of map inferred as Map<String, Int>, A map from string to integers
    var yearOfBirth = mapOf<String, Int>(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993

    )
    var namesAndScore = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "craig" to 8,
        "Donna" to 6
    )
    println(namesAndScore)

    //creating an empty map
    namesAndScore = mutableMapOf<String, Int>()

    //creating a new empty map
    var pairs = HashMap<String, Int>()

    //a map with a defined capacity, this being a way to improve performance when you have an idea of how much data the
    //map needs to store.
    pairs = HashMap<String, Int>(20)

    //Accessing values
    println(namesAndScore["Anna"])
    println(namesAndScore["Greg"])

    //Using properties and methods
    println(namesAndScore.get("Craig"))
    namesAndScore.isEmpty()
    namesAndScore.size

    val bobData = mutableMapOf<String, String>(
        "Name" to "Bob",
        "profession" to "cardplayer",
        "country" to "usa"
    )
    //Adding pairs
    bobData.put("state", "CA")

    //Adding pairs using subscripting
    bobData["city"] = "San Fransisco"

    //updating values
    bobData.put("name", "Bobby")

    //using subscripting
    bobData["Profession"] = "mailman"

    //using += infix operator to add a pair
    val pair = "nickname" to "bobby D"
    bobData += pair
    println(bobData)

    //Removing pairs
    //this first call removes the key city and its associated value
    bobData.remove("city")
    //removes the key only if the value matches the second
    bobData.remove("state", "CA")

    println("some string".hashCode())
    println(1.hashCode())
    println(false.hashCode())

    //for performance critical code HashMap<K, v> should be used via hashmapOf() instead of mapOf()
}