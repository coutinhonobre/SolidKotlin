package capitulo03

fun main() {
    val tabela: TabelaDePreco = TabelaDePrecoDiferenciada()
    val entrega: ServicoDeEntrega = Frete()
    val calculadoraDePrecos = CalculadoraDePrecos(tabela, entrega)
    val produto = Compra(valor = 120.9, cidade = "GOIANIA")
    val produtoCalculado = calculadoraDePrecos.calcula(produto = produto)
    println(produtoCalculado)
}