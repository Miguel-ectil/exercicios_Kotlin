fun main() {
    print("Digite o salário atual do funcionário: R$ \n")
    val salarioAtual = 4000.00

    print("Digite o gênero do funcionário (masculino ou feminino): \n")
    val genero = "masculino"

    print("Digite o tempo de trabalho na empresa (em anos): \n")
    val anosTrabalho = 25

    var novoSalario = salarioAtual

    if (genero == "feminino") {
        when {
            anosTrabalho < 15 -> novoSalario += salarioAtual * 0.05  
            anosTrabalho in 15..20 -> novoSalario += salarioAtual * 0.12  
            anosTrabalho > 20 -> novoSalario += salarioAtual * 0.23
        }
    } else if (genero == "masculino") {
        when {
            anosTrabalho < 20 -> novoSalario += salarioAtual * 0.03  // +3%
            anosTrabalho in 20..30 -> novoSalario += salarioAtual * 0.13  // +13%
            anosTrabalho > 30 -> novoSalario += salarioAtual * 0.25  // +25%
        }
    } else {
        println("Gênero inválido. Por favor, digite 'masculino' ou 'feminino'.")
        return
    }

    println("O novo salário do funcionário é: R$%.2f".format(novoSalario))
}
