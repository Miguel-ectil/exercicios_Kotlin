import java.time.LocalDate

fun main() {
    val anoAtual = LocalDate.now().year

    println("Digite a sua data de nascimento: ")
    val dataNasc = readln().toInt()

    val idade = anoAtual - dataNasc

    if (idade >= 16) {
        println("Você tem $idade anos e o voto é obrigatório.")
    } else {
        println("Você tem $idade anos e ainda não pode votar.")
    }
}
