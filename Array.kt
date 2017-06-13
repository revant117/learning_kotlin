package demo

fun main(args: Array<String>){
    //basics
    var myArray = arrayOf(1 , 1.5 , "name")
    println("${myArray.toString()}") // does not print the array out , gives [Ljava.lang.Object;@61bbe9ba
    println(myArray[1])
    println("${myArray.contains(1)}")
    println("${myArray.size}")
    println("${myArray.indexOf("name")}")

    //kind of like python list comprehensions
    var compArray = Array(5 , {x -> x+2})
    printArray(compArray)

    // typed array
    var typrdArray: Array<Int> = arrayOf(1, 2, 3)
    println("${1 in typrdArray}")

    //ranges , they are not of type array
    //TO CHECK: how to convert range type to array type?
    val range1 = 1.rangeTo(20).step(3)
    printRange(range1)
}

fun printArray(array: Array<Int>){
    for (i in array){
        print("$i ")
    }
}
fun printRange(range: IntProgression){
    for (i in range){
        print("$i ")
    }
}