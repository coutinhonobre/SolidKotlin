package capitulo04

internal class Pagamento(val valor: Double, forma: MeioDePagamento) {
    private val forma: MeioDePagamento

    init {
        this.forma = forma
    }

    fun getForma(): MeioDePagamento {
        return forma
    }

    override fun equals(obj: Any?): Boolean {
        if (obj !is Pagamento) {
            return false
        }
        val outro = obj
        return if (forma !== outro.forma
            || java.lang.Double.doubleToLongBits(valor) != java.lang.Double
                .doubleToLongBits(outro.valor)
        ) {
            false
        } else true
    }
}