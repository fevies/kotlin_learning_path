package controlFlow

/**
 * Boolean logic lets you combine multiple conditions to form a result
 * When you <AND> together two booleans the result is another boolean .if both input booleans are true, then the
 * result is true ,otherwise the result is false.
 *
 * When you <OR> together two Booleans , the result is true  if either of the inputs is true
 */
fun main() {
    val and = true && true
    val andfalse = true && false
    println(and)
    println(andfalse)

    val or = true || false
    println(or)
    val orFalse = false || false
    println(orFalse)



}