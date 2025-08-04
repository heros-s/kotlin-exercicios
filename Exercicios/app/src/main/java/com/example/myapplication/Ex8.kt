package com.example.primeiro

fun validadorIdade() {
    val idade: Int = 68

    if(idade < 18) {
        println("Menor de idade")
    }
    else if(idade >= 18 && idade <= 59) {
        println("Adulto")
    }
    else {
        println("Idoso")
    }
}

fun main() {
    validadorIdade()
}