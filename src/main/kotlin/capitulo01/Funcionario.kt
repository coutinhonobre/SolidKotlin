package capitulo01

import java.util.*

data class Funcionario(
    val id: Int,
    val nome: String,
    val cargo: Cargo,
    val dataDeAdmissao: Calendar,
    val salarioBase: Double,
) {
    fun calcularSalario(): Double {
        return cargo.getRegra().calcula(this)
    }
}