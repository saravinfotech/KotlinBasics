fun main() {

    //a simple class with properties, setting the properties from the class object
    var dogObject = Dog()
    dogObject.name = "tommy"
    dogObject.dogInfo()

    //class with properties in their constructor
    var dogObject1 = Dog1("Jimmy")
    dogObject1.dogInfo()
    var dogObject11 = Dog1("Jimmy", 10)
    dogObject11.dogInfo()


    //properties with default values
    var dogObject2 = Dog2()
    dogObject2.dogInfo()

    //class with constructor
    var dogObect3 = Dog3("Talen", 6)
    dogObect3.dogInfo()

    //add a new property called furcolor to the dogclass and update the dogInfo()
    var dogObject4 = Dog4()
    dogObject4.dogInfo()
    dogObject4.name = "Jacky"
    dogObject4.dogInfo()
}

//a simple class with properties, set the properties from the class object
class Dog {
    var name: String = ""
    var age: Int = 0

    fun dogInfo() {
        println("$name     $age")
    }
}


//class with properties in their constructor
class Dog1(var name: String, var age: Int = 5) {
    fun dogInfo() {
        println("$name     $age")
    }
}


//properties with default values
class Dog2(var name: String = "Roland", var age: Int = 5) {
    fun dogInfo() {
        println("$name     $age")
    }
}

//class with constructor
class Dog3 {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun dogInfo() {
        println("$name  $age")
    }
}

//add a new property called furcolor to the dogclass and update the dogInfo()
class Dog4 {
    var name: String = ""
    var furColor: String = "black"
    var age: Int = 4

    fun dogInfo() {
        println("$name  $furColor  $age")
    }
}