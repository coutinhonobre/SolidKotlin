package capitulo03

internal class TabelaDePrecoDiferenciada : TabelaDePreco {
    override fun descontoPara(valor: Double): Double {
        return 0.3
    }

}
