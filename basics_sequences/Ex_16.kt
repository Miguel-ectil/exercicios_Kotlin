fun main() {
    println("Digite a quantidade de cigarros fumados por dia: ")
    val quantCigarros = readln().toInt()

    println("Por quantos anos já fuma: ")
    val quantAnos = readln().toInt()

    val totalCigarrosFumados = quantCigarros * (quantAnos * 365)
    val minutosPerdidos = totalCigarrosFumados * 10
    val diasPerdidos = minutosPerdidos / 1440

    println("Você como fumante perdeu aproximadamente $diasPerdidos dias de vida.")
}

