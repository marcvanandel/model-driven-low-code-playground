package land.administration.state

import java.time.LocalDateTime

data class ObjectIdentifier(val namespace: String, val localId: String)

data class Fraction(val denominator: Int, val numerator: Int) {
    fun real() = denominator / numerator
}

abstract class RightRestrictionOrResponsibility(
        open val description: String,
        open val rId: ObjectIdentifier,
        open val share: Fraction,
        open val shareCheck: Boolean,
        open val timeSpec: LocalDateTime
)

data class Responsibility(
        override val description: String,
        override val rId: ObjectIdentifier,
        override val share: Fraction,
        override val shareCheck: Boolean,
        override val timeSpec: LocalDateTime
) : RightRestrictionOrResponsibility(description, rId, share, shareCheck, timeSpec)

data class Restriction(
        override val description: String,
        override val rId: ObjectIdentifier,
        override val share: Fraction,
        override val shareCheck: Boolean,
        override val timeSpec: LocalDateTime
) : RightRestrictionOrResponsibility(description, rId, share, shareCheck, timeSpec)

data class Right(
        override val description: String,
        override val rId: ObjectIdentifier,
        override val share: Fraction,
        override val shareCheck: Boolean,
        override val timeSpec: LocalDateTime
) : RightRestrictionOrResponsibility(description, rId, share, shareCheck, timeSpec)

data class BasicAdministrativeUnit(
        val name: String,
        val type: BasicAdministrativeUnitType,
        val uid: ObjectIdentifier)

enum class BasicAdministrativeUnitType {

}
