fun main() {

    //Does not allow null by default
    var test: String = "hello"
    //Cannot assign null  as the string declaration does not support nullable values
    //test = null

    //Declaring a string with nullable type
    var nullableString: String? = "welcome"
    nullableString = null

    println(nullableString)
    nullableString = "test"
    //converting nullable string to non-nullable string
    var test1 = nullableString!!
//    test1 = null --> Cannot be assigned
    // nullableString = null --> gives
    println(test1)
}