fun main() {
    val horasDias = 8
    val valorHora = 25.0

    println("Digite a quantidade de dias trabalhadas no mês: ")
    val quantDias = readln().toDouble()

    val salario = quantDias * horasDias * valorHora

    println("O salário do funcionário é: R$ %.2f".format(salario))

}
