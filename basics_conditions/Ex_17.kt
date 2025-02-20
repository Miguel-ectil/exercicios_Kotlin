fun main() {
    val multaKm = 5.0

    println("Digite a velocidade do seu carro: ")
    val velocidadeCarro = readln().toDouble()

    if (velocidadeCarro > 80) {
        val multa = (velocidadeCarro - 80) * multaKm

        println("Você foi multado por excesso de velocidade! (Acima de 80Km/h)")
        println("O valor da sua multa é de R$%.2f".format(multa))
    } else {
        println("Velocidade dentro do limite permitido. Dirija com segurança!")
    }
}
