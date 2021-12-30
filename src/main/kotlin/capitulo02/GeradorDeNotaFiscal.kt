package capitulo02

internal data class GeradorDeNotaFiscal(val acoes: List<AcaoAposGerarNota>) {

    fun gera(fatura: Fatura): NotaFiscal {
        val valor: Double = fatura.valorMensal
        val nf = NotaFiscal(valorBruto = valor, impostos = impostoSimplesSobreO(valor))

        acoesAposGerarNota(nf)

        return nf
    }

    private fun acoesAposGerarNota(nf: NotaFiscal) {
        acoes.forEach { action ->
            action.executa(nf)
        }
    }

    private fun impostoSimplesSobreO(valor: Double): Double {
        return valor * 0.06
    }
}