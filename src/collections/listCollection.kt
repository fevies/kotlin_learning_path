package collections

fun main() {
    //A list is a container , which is an object that holds other containers.
//type is inferred
    val numbers = listOf(1, 2, 3)
    val string: List<String> =
        listOf("one", "two", "three")

//explicitly typed.
    val numbers2: List<Int> = listOf(1, 2, 3,)
    val stringTwo: List<String> = listOf("one", "two", "three")

    val innerPlanets = listOf("Mercury", "venus", "earth", "Mars") //inferred  to be List<String>

//creating an empty list
    val subscribers: List<String> = listOf()

//the type argument can also be placed on the function
    val subscribersTwo = listOf<String>()

//mutable lists
    val exoPlanets = mutableListOf<String>()

    val players = mutableListOf<String>("Alice", "Bob", "Cindy", "Dan")
    println(players.isEmpty())
    val size = players.size
    println("the number of players is $size")

    if (size < 2) {
        println("We need at least two players")
    } else {
        println("Let's start")
    }
    //Accessing elements using properties
    //list provides the first() method to fetch the first object of a list
    var currentPlayer = players.first()
    println(currentPlayer)
    println(players.last())

    //Accessing elements using indexing
    val firstPlayer = players[0]
    println("The first player is $firstPlayer")

    //using ranges to slice
    //The slice() method with ranges can be used to fetch more than a single value from an array list.
    val upcomingPlayersSlice = players.slice(1 ..2) //the range 1..2 represents the second and third
    println(upcomingPlayersSlice.joinToString())

    fun isEliminated(player: String): Boolean {
        return player !in players
    }

    println(isEliminated("Bob"))
    players.slice(1..3).contains("Alice")

    //Modifying lists -making changes to mutable lists such adding and removing elements, updating existing values and
    //moving  elements around into a different  order.

    //adding player Eli
    players.add("Eli")
    players += "Gina"
    println(players.joinToString())

    players.add(5, "frank")

    //removing elements - this method removes the element and returns a string
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")
    val checkPlayer = players.indexOf("Dan")
    println("Dans position is $checkPlayer")

    //Updating elements
    println(players.joinToString())
    players[4] = "Franklin"
    println(players.joinToString())

    players[3] = "Anna"
    players.sort()
    println(players.joinToString())

   for (player in players) {
       println(player)
   }
    for ((index, player) in players.withIndex()) {
        println("${index + 1}. $player")
    }



}
