package capitulo01

class FifteenOrTwentyFivePercent : CalculationRule {
    override fun calcula(employee: Employee): Double {
        return if (employee.baseSalary > 2000.0) {
            employee.baseSalary * 0.75
        } else {
            employee.baseSalary * 0.85
        }
    }
}