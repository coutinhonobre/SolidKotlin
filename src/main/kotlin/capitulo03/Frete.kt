package capitulo03

import java.util.*

internal class Frete : ServicoDeEntrega {
    override fun para(cidade: String): Double {
        return if ("SAO PAULO" == cidade.uppercase(Locale.getDefault())) {
            15.0
        } else 30.0
    }
}