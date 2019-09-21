package Basics

import java.io.IOException

fun main(args: Array<String>) {

    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        ""
    } finally { //will always be called
        println("Finished reading external input")
    }

    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read input") //no new keyword in kotlin
}