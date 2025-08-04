fun main() {
    val numeroDia = 3

    when (numeroDia) {
        1 -> println("Segunda-feira")
        2 -> println("Terça-feira")
        3 -> println("Quarta-feira")
        4 -> println("Quinta-feira")
        5 -> println("Sexta-feira")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Número inválido! Use números de 1 a 7.")
    }
}