fun main() {


    //For loop range 1--> 10
    for (i in 1..10) {
        print(" " + i)
    }

    println()
    //for loop range 5--> 10
    for (i in 5..10) {
        print(" " + i)
    }
    println()

    var candyList = mutableListOf<String>("Snickers", "Milky bar", "Dairy Milk")
    for (candy in candyList) {
        print(" " + candy)
    }
    println()
    for (i in 1..100) {
        if (i % 2 != 0) {
            print(" " + i);
        }
    }
}