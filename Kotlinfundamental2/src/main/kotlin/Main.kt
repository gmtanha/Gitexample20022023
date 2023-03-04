fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var month = 6
    var message = when (month){
        in 1..3 -> "Quý 1"
        in 4..6 -> "Quý 2"
        in 7..9 -> "Quý 3"
        in 10..12 -> "Quý 4"
        else -> "Không thuộc quý nào"
    }
    println(message)
}