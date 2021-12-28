package capitulo01

import java.util.*

data class Employee(
    val id: Int,
    val name: String,
    val occupation: Occupation,
    val admissionDate: Calendar,
    val baseSalary: Double,
) {
    fun calculateSalary(): Double {
        return occupation.getRule().calcula(this)
    }
}