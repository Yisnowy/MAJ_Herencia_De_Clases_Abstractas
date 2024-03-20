package org.example.Class

class International(override val country: String, override val city: String) : Travel() {

    // [4] Redefinido para obtener el precio de un viaje con impuesto incluido.
    override fun getPrice(numDays: Int): Int {
        val basePrice = getBasePrice(city)
        val taxPercentage = getTaxPercentage(country)
        if (basePrice == 0 || taxPercentage == 0) {
            println("Lo sentimos, la ciudad o el país seleccionados no son válidos.")
            return 0
        }
        val totalPrice = basePrice * numDays * (1 + taxPercentage / 100.0)
        return totalPrice.toInt()
    }

    // [2] Eliminado el quotePrice

    private val cityCountryMap = mapOf(
        "Munich" to "Alemania",
        "Berlín" to "Alemania",
        "Francfort" to "Alemania",
        "Santiago" to "Chile",
        "Valparaíso" to "Chile",
        "Vancouver" to "Canadá",
        "Ottawa" to "Canadá",
        "Montreal" to "Canadá"
    )

    // [3] Precios
    private fun getBasePrice(city: String): Int {
        return when (city) {
            "Munich" -> 980
            "Berlín" -> 820
            "Francfort" -> 850
            "Santiago" -> 643
            "Valparaíso" -> 721
            "Vancouver" -> 620
            "Ottawa" -> 680
            "Montreal" -> 600
            else -> 0
        }
    }

    private fun getTaxPercentage(country: String): Int {
        return when (country) {
            "Alemania" -> 16
            "Chile" -> 5
            "Canadá" -> 10
            else -> 0
        }
    }
}