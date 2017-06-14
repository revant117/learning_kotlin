package demo

fun main(args: Array<String>){

    var multiplicator3 = makeMultiplicator(3)
    var c = multiplicator3(3)
    getMethod(3 , makeMultiplicator(4))
    println("$c")
}

fun makeMultiplicator(num:Int)  :(Int) -> Int {  // this method will return a method that takes int and returns int
    return {num1 -> num*num1} // can pass a lambda here , basically return a function
}

// passing functions as argument
fun getMethod(num:Int , meth: (num:Int) -> Int) {
    println(meth(num))
}