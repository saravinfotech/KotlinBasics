fun main() {

    var radius = 6
    var pi: Float = 3.14f
    var circumference = radius * pi * 2

    println(circumference)

    var circumIntValue: Int = radius * pi.toInt() * 2

    println(circumIntValue)


    var wallet: Int = 40
    wallet -= 5

    println("Total money in wallet is $wallet")

    wallet += 100

    println("Money in wallet increased to $wallet")
}