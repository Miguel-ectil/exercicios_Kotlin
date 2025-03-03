import java.time.LocalDate

fun main() {
  val anoAtual = LocalDate.now().year
    
  print("Digite o seu ano de nascimento: \n")
  val anoNasc = readln().toInt()
    
  val idade = anoAtual - anoNasc
    
  if (idade < 18) {
    val tempoRes = 18 - idade
    println("você tem $idade anos, falta $tempoRes ano para o seu alistamento")
  } else {
    val tempoPassado = (anoAtual - anoNasc) - 18
    println("Você tem $idade anos e já se passaram $tempoPassado anos do seu alistamento")
  }
}
