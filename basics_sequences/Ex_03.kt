fun main() {
    println("Digite seu nome?")
    var name = readln()

    println("Digite o seu salário?")
    var salario = readln()!!.toDouble()
    var  salFormatado = String.format("%.2f", salario).toString()
    print("O funcionario \n${name}, tem um \nsalário: \n${salFormatado} !")
}