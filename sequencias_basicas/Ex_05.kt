fun main() {
    println("Digite a sua nota?")
    var nota1 = readln()!!.toDouble()

    println("Digite a sua outra nota?")
    var nota2 = readln()!!.toDouble()

    var media = (nota1 + nota2) / 2
    print("A média entre ${nota1}, e ${nota2}  é igual a ${media}!")
}