fun main() {
    println("Digite um número:")
    var num1 = readln()!!.toDouble()

    var dobro = num1 * 2
    var tercaParte = num1 / 3
    print("O dobro de  ${num1} é ${dobro} \nA terça parte de ${num1} é ${tercaParte}!")
}