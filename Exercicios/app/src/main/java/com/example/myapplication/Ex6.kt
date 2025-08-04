package com.example.primeiro

fun main() {
    val a = true
    val b = false

    val resultadoAnd = a && b
    println("a && b = $resultadoAnd")  // False, porque b é false

    val resultadoOr = a || b
    println("a || b = $resultadoOr")  // True, porque a é true

    val resultadoNotA = !a
    val resultadoNotB = !b
    println("!a = $resultadoNotA")  // False, porque a é true
    println("!b = $resultadoNotB")  // True, porque b é false
}
