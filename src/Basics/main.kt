package Basics

import java.util.*

val PI = 3.1415
fun main(args: Array<String>) {

    val list = listOf<String>("Kotlin", "Android")
    println(list)
    println(PI)

    val input: Int? = readLine()?.toInt()
    when (input) {
        1 -> println("The number is $input")
        in 2..5 -> println("Greater than 1")
        else -> println("greater than 5")
    }

//    val rand = Random()
    val mutableList = mutableListOf<Int>()

    for (i in 1..100) {
        mutableList.add(i)
    }

//    repeat(100) {
//        mutableList.add(rand.nextInt(100))
//    }

    var i = 0
    while (i < mutableList.size) {
        println(mutableList[i])
        i++
    }


}