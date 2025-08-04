package com.example.primeiro

fun comparacao1() {
    val num1: Int = 10
    val num2: Int = 5

    if (num1 > num2) {
        println("$num1 é maior que $num2")
    }
    else {
        println("$num1 é menor que $num2")
    }
}

fun comparacao2() {
    val num1: Int = 5

    if(num1 == 5){
        println("$num1 é igual a 5")
    }
    else {
        println("$num1 é diferente de 5")
    }
}

fun main() {
    comparacao1()
    comparacao2()
}