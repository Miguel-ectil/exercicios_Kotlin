fun main() {
  println("Digite um valor?")
  val n1 = readln().toInt()

  println("Digite outro valor?")
  val n2 = readln().toInt()

  val media = (n1 + n2) / 2
  print("A media entre $n1, e $n2 é igual a, $media")
}