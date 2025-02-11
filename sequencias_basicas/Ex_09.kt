fun main() {
    println("Quanto dinheiro você tem na carteira (em reais):")
    val money = readln().toDouble()

    val taxaCambio= 3.45
    val dollars = money / taxaCambio

    println("Com R$${"%.2f".format(money)} você pode comprar US$${"%.2f".format(dollars)} dólares.")
}
