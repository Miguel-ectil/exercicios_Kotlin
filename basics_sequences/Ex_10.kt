fun main() {
  println("Qual é a largura da parede:")
  val largura = readln().toDouble()

  println("Qual é a altura da parede:")
  val altura = readln().toDouble()

  val area = largura * altura
  val tinta = area / 2

  println("A sua parede tem a dimensao de  ${largura} X ${altura} e a sua área é de${area}m² dólares.")
  print("E para pintar essa parede, você precisara de ${tinta}L de tinta.")

}
