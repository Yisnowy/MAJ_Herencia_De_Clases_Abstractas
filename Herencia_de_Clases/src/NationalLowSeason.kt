package org.example.Class

import org.example.Interfaces.IPromotion
import org.example.Interfaces.ICancelableTravel

class NationalLowSeason(city: String) : National(city), IPromotion, ICancelableTravel {
    override val discount = 10 // es porcentaje, o sea 10%
    override val typeDiscount = 0 // 0 para porcentaje, 1 para cantidad

    private var isCancelled = false

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0 || isCancelled) 0 else getDiscountPrice(amount)
    }

    override fun cancelTravel() {
        isCancelled = true
        println("El viaje ha sido cancelado.")
    }
}