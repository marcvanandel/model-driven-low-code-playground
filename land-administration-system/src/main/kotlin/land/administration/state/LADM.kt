package land.administration.state

import java.time.LocalDateTime

data class ObjectIdentifier(val namespace: String, val localId: String)

data class Fraction(val denominator: Int, val numerator: Int) {
    fun real() = denominator/numerator
}

abstract class RightRestrictionOrResponsibility(
    val description: String,
    val rId: ObjectIdentifier,
    val share: Fraction,
    val shareCheck: Boolean,
    val timeSpec: LocalDateTime
)