package org.example.Class

open class National(override val city:String):Travel() {
    override val country = "Mexico"

    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristóbal de las casas" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city]
        return if (fee==null) 0 else fee*numDays
    }

    // [2] Eliminado el quotePrice

}