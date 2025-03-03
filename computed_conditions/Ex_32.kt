import kotlin.random.Random

fun main() {
  val numeroAleatorio = Random.nextInt(1, 5)
  
  println("Qual é o número sorteado? $numeroAleatorio\n")
  val num = readln().toInt()
    
  if (num == numeroAleatorio) {
    println("Parabéns você acertou o número secreto $numeroAleatorio")
  } else {
    println("Errou! você não acertou o número secreto, tente novamente.")
  }
}
