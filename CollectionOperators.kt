package demo

fun main(args: Array<String>){
    var list = listOf(1,2,3,4,5,6)
    //reduce
    var a = list.reduce{x,y -> x+y} //unlike js , can not pass initial val here
    println("$a")
    // fold is like reduce but with option to pass initial val
    var b = list.fold(5){x,y-> x*y}
    println("$b")

    // all and any return boolean based on if all/any in the list match the condition
    var c = list.any{it > 15}
    println("$c")
    var d = list.all{it < 15}
    println("$d")

    // filter returns another array which is a subset
    var e = list.filter{ it > 5}
    printList(e)

    //map
    var f = list.map {it * 2}
    printList(f)

    // mutable and immutable list
    val imm:List<Int> = listOf(1,2,3) // listOf is immutable by default
    var mut:MutableList<Int> = mutableListOf(1,2,3)

    // maps can also be mutable and immutable
    var map = mutableMapOf<Any? , Any?>()  // here key and val can be anything , can be more specific i needed
    map.put(0 , "val1" )
    map.put("key" , 2)

    for((key , value) in map){
        println("$key : $value")
    }
}

fun printList(list: List<Int>) {
    // for each with list
    list.forEach{n -> print("$n ,")}
    print("\n")
}