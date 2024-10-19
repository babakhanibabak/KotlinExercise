package com.example.kotlinexersice.higherOrderFunction

//higherOrderFunction

fun higherOrderFunction(operation:(Int,Int)->Int,a:Int,b:Int):Int{
    return operation(a,b)
}

fun main(){
    val sumOperation= higherOrderFunction({x,y ->x+y},5,3)
    println(sumOperation)

    val divOperation= higherOrderFunction({x,y ->x/y},8,2)
    println(divOperation)
}