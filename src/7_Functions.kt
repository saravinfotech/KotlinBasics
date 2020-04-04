fun main() {
    //declare a function
    fun printFunction() {
        println("Sample function ")
    }
    printFunction()
    //return  a value
    println(returnValueFunciton())
    //pass a parameter
    functionWithParameter("Raj")
    println(functionWithTwoParameters("Raj", 5))

    //pass the default parameter if no parameters passed
    functionWithDefaultParam()

    //shorthand functions
    fun add(a: Int, b: Int) = a + b

    println(add(2, 3))

    dogDetails("Tommy", 6)
}

//return  a value
fun returnValueFunciton(): String {
    return "Function returned this string"
}

//pass a parameter
fun functionWithTwoParameters(name: String, age: Int): String {
    return "Hi $name is your age $age";
}

//pass a parameter
fun functionWithParameter(name: String) {
    println("Hai $name")
}

//pass the default parameter if no parameters passed
fun functionWithDefaultParam(name: String = "You forgot to mention your name", age: Int = 0) {
    println("$name  ,  $age")
}

//Make a function that takes a dog's name and age, and prints a sentence about it
fun dogDetails(name: String, age: Int) {
    println("Your dogs name is $name, and the age of the dog is $age")
}
