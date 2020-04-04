fun main() {


    //Declaration type 1
    var arrayDeclarationType1 = arrayOf(1, 2, 3, 4)
    arrayDeclarationType1[1]
    arrayDeclarationType1[2]

    /*  //Declaration type 2
      var arrayDeclarationType2 = arrayOf<Int>()
      arrayDeclarationType2[0] = 1
      arrayDeclarationType2[1] = 2*/

    println(arrayDeclarationType1)
    //println(arrayDeclarationType2)

    var luckyNumbers = mutableListOf<Int>()
    luckyNumbers.add(1)
    luckyNumbers.add(0, 2)

    println(luckyNumbers)

    //Arrays with Generic type defined
    var movieList = mutableListOf<String>("Fast & Furious", "Harry potter", "Spider man")
    println(movieList)

}