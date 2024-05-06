import java.util.*

fun main() {
    val isUnit = println("This is an expression")
    println(isUnit)
    // This is an expression
    // kotlin.Unit
    // println() returns kotlin.Unit, which is equivalent to void in Java

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    // dart에서라면 isHot = temperature > 50 ? true : false;
    println(isHot)
    // false

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)
    // You are safe fish

    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
