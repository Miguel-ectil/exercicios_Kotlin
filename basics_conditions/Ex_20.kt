fun main() {
    println("Digite a um número: ")
    val num = readln().toInt()
    
    if (num % 2 == 0) {
        println("O número $num é par.")
    } else {
        println("O número $num é impar.")
    }
}