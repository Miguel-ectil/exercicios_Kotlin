fun main() {
    println("Digite um número?")
    var num1 = readln().toInt()

    var antece = num1 - 1
    var sucessor = num1 + 1
    print("O Antecessor de  ${num1} é ${antece} \nO sucessor de ${num1} é ${sucessor}!")
}