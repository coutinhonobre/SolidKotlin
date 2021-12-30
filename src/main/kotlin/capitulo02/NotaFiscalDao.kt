package capitulo02

internal class NotaFiscalDao : AcaoAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("salva nf no banco")
    }
}