package capitulo01

class TenOrTwentyPercent : CalculationRule {
    override fun calcula(employee: Employee): Double {
        return if (employee.baseSalary > 3000.0) {
            employee.baseSalary * 0.8
        } else {
            employee.baseSalary * 0.9
        }
    }
}