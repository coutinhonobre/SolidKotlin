package capitulo02

internal class EnviadorDeEmail : AcaoAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("envia email da nf " + nf.id)
    }
}