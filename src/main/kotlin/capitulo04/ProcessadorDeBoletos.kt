package capitulo04

import capitulo04.Fatura


internal class ProcessadorDeBoletos {
    fun processa(boletos: List<Boleto>?, fatura: Fatura) {
        var total = 0.0
        boletos?.forEach { boleto ->
            val pagamento = Pagamento(boleto?.valor, MeioDePagamento.BOLETO)
            fatura.adicionaPagamento(pagamento)
        }
    }
}