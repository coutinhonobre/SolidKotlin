package capitulo01

enum class Occupation(private val calculationRule: CalculationRule) {
    Developer(TenOrTwentyPercent()),
    DBA(FifteenOrTwentyFivePercent()),
    TESTER(FifteenOrTwentyFivePercent());

    fun getRule(): CalculationRule = calculationRule
}
