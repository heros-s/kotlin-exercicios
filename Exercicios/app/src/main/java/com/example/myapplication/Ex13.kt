package com.example.myapplication

fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Laranja")

    for ((index, fruta) in frutas.withIndex()) {
        println("$index: ${fruta}")
    }
}