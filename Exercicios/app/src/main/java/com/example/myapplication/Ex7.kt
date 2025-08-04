package com.example.primeiro

fun idade() {
    val idade1: Int = 16

    if(idade1 >= 18){
        println("Com $idade1 anos pode dirigir!")
    }
    else {
        println("Com $idade1 anos não pode dirigir!")
    }
}

fun main() {
    idade()
}