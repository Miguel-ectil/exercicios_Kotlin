fun main() {
  println("Digite o valor inicial: \n")
  var valorInicial = readln().toInt()
  
  println("Digite o valor final: \n")
  val valorFinal = readln().toInt()
    
  println("Digite o incremento: \n")
  val valorIncremento = readln().toInt()
 
  if (valorInicial <= valorFinal) {
    if (valorIncremento <= valorFinal) {
      while(valorInicial <= valorFinal) {
        println(valorInicial)
        valorInicial += valorIncremento
      }
      println("Acabou!")
    } else {
      println("O valor de incremento não pode ser maior que o valor final!\nporfavor tente novamente")  
    }
  } else {
    println("O valor inicial não pode ser maior que o valor final!\nporfavor tente novamente")
  }
  
} 

