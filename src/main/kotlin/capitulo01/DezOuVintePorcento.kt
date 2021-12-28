package capitulo01

class DezOuVintePorcento : RegraDeCalculo {
    override fun calcula(funcionario: Funcionario): Double {
        return if (funcionario.salarioBase > 3000.0) {
            funcionario.salarioBase * 0.8
        } else {
            funcionario.salarioBase * 0.9
        }
    }
}