package capitulo02

internal data class NotaFiscal(var id: Int? = 0, var valorBruto: Double, var impostos: Double) {
    val valorLiquido: Double
        get() = valorBruto - impostos
}