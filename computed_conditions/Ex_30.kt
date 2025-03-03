fun main() {
    print("Digite o comprimento do primeiro segmento: \n")
    val lado1 = 5

    print("Digite o comprimento do segundo segmento: \n")
    val lado2 = 5

    print("Digite o comprimento do terceiro segmento: \n")
    val lado3 = 2

    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
        if (lado1 == lado2 && lado2 == lado3) {
            println("É um triângulo EQUILÁTERO.")
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            println("É um triângulo ISÓSCELES.")
        } else {
            println("É um triângulo ESCALENO.")
        }
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}
