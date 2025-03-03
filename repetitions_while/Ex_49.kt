fun main() {
  var cont = 1
  var numPares = 0
  var numImpares = 0
    
  while(cont <= 6) {
    println("Digite o $cont número: ")
    val num = readLine()!!.toInt()
      
    if (num % 2 == 0) {
      numPares += 1
    } else {
      numImpares += 1
    }
    cont += 1
  }
  println("Nos valores recebidos, $numPares números são pares e $numImpares são impares")  
} 

