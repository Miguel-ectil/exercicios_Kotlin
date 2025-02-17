fun main() {
    val precoPorDia = 90.0
    val precoPorKm = 0.20

    println("Digite a quantidade de Km percorridos por um carro alugado: ")
    val km_carro_alugado = readln().toDouble()

    println("Digite a quantidade de Km percorridos por um carro alugado: ")
    val dias_carro_alugado = readln().toDouble()

    val totalPagar = (dias_carro_alugado * precoPorDia) + (km_carro_alugado * precoPorKm)

    println("O total a pagar é: R$ %.2f".format(totalPagar))

}
