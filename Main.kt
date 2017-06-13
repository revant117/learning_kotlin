package demo

fun main(args: Array<String>){
    println("hello world")

    val name = "john" // val means immutable variable
    var age = 22 // var is mutable
    var numm: Int = 23 // declaring with type

    println("numm =  $numm") // string interpolation
    println("more interpolation: ${numm is Int}") // more interpolation , evaluates to true and then converts to strong

    //Cating
    println(12345.toString())
    println(65.toChar())

    // Basic string manipulation
    var randomString = "master chief"
    println("${randomString.subSequence(0,6)}")
    println("${randomString[1]}")
    println("${randomString.contains("master")}")
}