package demo

import java.util.Random
// we can use java libraries inside Kotlin files like this
fun main(args: Array<String>){
    // simple ise of java methods
    val rand = Random()
    var randNum = rand.nextInt(50)
    // using when instead of switch case
    var biceps = 16
    when(biceps){
        0,1,2,3,4,5,6 -> println("chicken")

        in 7..13 -> println("too small")

        in 14..17 -> println("do u even lift bruh ??")

        in 18..23 -> println("beast")
        // default
        else -> {}
    }

    //for loop will loop thru any iterable using "in"
    for (x in 1..10){

    }

    var array = arrayOf(1,2,3,4,5)
    for(x in array.indices){    // x in aray will loop through the elements
        print("${x}")
    }
    print('\n')
    for((index,value) in array.withIndex()){
        println("index: $index and val: $value")
    }
}

// simple single line function definition
fun add(num1:Int = 1, num2:Int):Int = num1+num2 // == is like return
// vararg
fun names(vararg names:String){
    names.forEach {
       n ->  print("$n ")
    }
}
// inline functions
var sumInline = {num1:Int , num2:Int -> num1+num2}

//recursive functions
fun recurse(num:Int):Int{
    tailrec fun rec(num:Int , z:Int):Int{
        if(num==0) return z
        else return rec(num-1 , num*z)
    }
    return rec(num,1)
}