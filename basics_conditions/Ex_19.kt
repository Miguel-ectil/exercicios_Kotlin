fun main() {
    println("Digite o seu nome: ")
    val nome = readln()

    println("Digite a 1ª nota: ")
    val nota1 = readln().toDouble()

    println("Digite a 2ª nota: ")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2

    println("A média do aluno $nome é igual a: $media")

    if (media >= 7) {
        println("A média está igual ou acima de 7, portanto, o aluno $nome teve um bom aproveitamento.")
    } else {
        println("A média está abaixo de 7, portanto, o aluno $nome não teve um bom aproveitamento.")
    }
}