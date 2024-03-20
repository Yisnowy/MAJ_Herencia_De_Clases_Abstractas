//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.example.Class.International
import org.example.Class.National
fun main() {

    // [Intro]
    val nationalTrip = National("CDMX")
    nationalTrip.quotePrice(7)


    // [1]
    val internationalTrip = International("Francia", "París")
    internationalTrip.quotePrice(7)

    // [2] Movemos la implementación del método quotePrice
    // a la clase abstracta Travel y lo eliminamos de sus clases hijos.

    // [4]
    val internationalTrip2 = International("Alemania", "Munich")
    internationalTrip2.quotePrice(7)

    // [5]
    val nationalTrip2 = National("Guadalajara")
    nationalTrip2.quotePrice(4)

}