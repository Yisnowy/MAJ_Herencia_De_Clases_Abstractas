package org.example.Class

abstract class Travel {
    abstract val country: String
    abstract val city: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    fun reserve(numDays: Int){
        if(reserved){
            println("""¡Ya reservaste tu viaje! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount==0){
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Viaje reservado exitosamente! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
    }

    protected abstract fun getPrice(numDays: Int): Int

    // [2] Implementacion de quotePrice en la clase abstracta
    fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if(price==0){
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city, $country cuesta \$$price")
        }
    }
}