package capitulo01

class QuinzeOuVinteCincoPorcento : RegraDeCalculo {
    override fun calcula(funcionario: Funcionario): Double {
        return if (funcionario.salarioBase > 2000.0) {
            funcionario.salarioBase * 0.75
        } else {
            funcionario.salarioBase * 0.85
        }
    }
}