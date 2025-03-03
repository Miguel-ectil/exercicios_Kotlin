fun main() {
    print("Digite o tipo de carro (popular ou luxo): \n")
    val tipoCarro = readLine()!!.toLowerCase()

    print("Digite a quantidade de dias de aluguel: \n")
    val diasAluguel = readln().toInt()

    print("Digite a quantidade de Km percorridos: \n")
    val kmPercorridos = readln().toInt()

    var precoDia = 0.0
    var precoKm = 0.0

    if (tipoCarro == "popular") {
        precoDia = 90.0
        if (kmPercorridos <= 100) {
            precoKm = kmPercorridos * 0.20
        } else {
            precoKm = kmPercorridos * 0.10
        }
    } else if (tipoCarro == "luxo") {
        precoDia = 150.0
        if (kmPercorridos <= 200) {
            precoKm = kmPercorridos * 0.30
        } else {
            precoKm = kmPercorridos * 0.25
        }
    } else {
        println("Tipo de carro inválido. Por favor, digite 'popular' ou 'luxo'.")
        return
    }

    val valorTotal = (precoDia * diasAluguel) + precoKm

    println("O valor total a ser pago é: R$%.2f".format(valorTotal))
}
