fun main() {
    var personObj = Person()
    println("Method from Person class called to print ${personObj.display()}")
}


class Person {
    fun display() {
        println("Display method called")
    }
}