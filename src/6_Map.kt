fun main() {

    //Static size map declaration
    var dogs = mapOf("Tommy" to 1, "Jimmy" to 2)

    println(dogs.get("Jimmy"))

    //Dynamic type map declaration
    var animals = mutableMapOf("Tiger" to 1, "Lion" to 2)

    animals["Deer"] = 3

    println(animals["Deer"])

}