package capitulo01

enum class Cargo(private val regraDeCalculo: RegraDeCalculo) {
    DESENVOLVEDOR(DezOuVintePorcento()),
    DBA(QuinzeOuVinteCincoPorcento()),
    TESTER(QuinzeOuVinteCincoPorcento());

    fun getRegra(): RegraDeCalculo = regraDeCalculo
}
