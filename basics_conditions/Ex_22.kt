import java.time.LocalDate

fun main() {
	val anoAtual = LocalDate.now().year
    
    print("Digite o seu ano de nascimento: \n")
    val anoNasc = readln().toInt()
    
    val idade = anoAtual - anoNasc
    
    if (idade <= 17) {
        println("$idade\n você não pode se alistar no exercíto militar")
    } else {
        println("$idade\n você já pode se listar no exercíto militar")
    }
}
