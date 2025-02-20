fun main() {
    println("Digite o seu salário: ")
    val salario = readln().toDouble()

    val aumento  = salario * 0.15
    val novoSalario  = salario + aumento

    println("Você recebeu 15%% de aumento, agora o seu salário é R$ %.2f".format(novoSalario))
}
