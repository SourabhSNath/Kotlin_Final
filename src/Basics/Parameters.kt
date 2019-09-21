package Basics

fun main(args: Array<String>) {
    val string = concat(listOf("Java", "Kotlin", "C++"))
    println(string)
}

fun concat(list: List<String>, separator: String = ", ") = list.joinToString(separator)