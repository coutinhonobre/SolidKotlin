package capitulo03

internal data class CalculadoraDePrecos(
    val tabela: TabelaDePreco,
    val entrega: ServicoDeEntrega
) {
    fun calcula(produto: Compra): Double {
        val desconto: Double = tabela.descontoPara(produto.valor)
        val frete: Double = entrega.para(produto.cidade.toString())
        return produto.valor * (1 - desconto) + frete
    }
}