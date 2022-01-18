package capitulo04


internal data class Fatura(
    val cliente: String,
    val valor: Double,
    val pagamentos: MutableList<Pagamento> = mutableListOf(),
    var isPago: Boolean = false
) {

    fun adicionaPagamento(pagamento: Pagamento) {
        this.pagamentos.add(pagamento)
        if (valorTotalPagamentos() > this.valor) {
            this.isPago = true
        }
    }

    private fun valorTotalPagamentos(): Double = pagamentos.sumOf { it.valor }
}
