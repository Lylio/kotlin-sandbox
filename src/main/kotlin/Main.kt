fun main(args : Array<String>) {
    println("No semi-colons!")
    greeting("Barry the Barrel")
    interaction()

}

fun greeting(name : String) {
    println("Hello $name!")
}

fun interaction() {
    var botName : String = "Koby"
    print("Please enter your name: ")
    val userInput = readln()
    println("Hi $userInput, nice to meet you! My name is $botName the Kotlin King!")
}