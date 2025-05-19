package looping

fun main() {
    //repeats a block of code while the condition is always true.
    var sum = 1
    while (sum < 1000) {
        sum = sum + (sum + 1)
    }
    println("sum is $sum")

    //A variant of the while loop is called the do-while loop.

    sum = 1
    println("the current sum is $sum")

    do {
        sum =  sum + (sum + 1)
    }while (sum < 1000)
    println("sums new value is $sum")

    sum = 1
    while (sum < 1){
        sum = sum + (sum + 1)
    }
    println(sum)

    sum = 1
    do {
        sum = sum + (sum + 1)
    }while (sum < 1)
    println("the value of sum is $sum")


    sum = 1
    while (true) {
        sum = sum + (sum + 1)

        if (sum >= 1000) {
            break
        }
    }
}