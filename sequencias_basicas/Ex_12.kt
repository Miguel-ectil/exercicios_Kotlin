fun main() {
    println("Digite o preço do produto:")
    val preco = readln().toDouble()

    val desconto = preco * 0.05
    val precoPromocao = preco - desconto

    println("Com 5%% de desconto, o preço promocional fica R$ %.2f".format(precoPromocao))
}
