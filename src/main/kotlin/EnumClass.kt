
interface  CardCashback{
    fun getCashback() : Float
}

enum class CreditCardType(val color:String, val limit: Int): CardCashback{
    SILVER("Grey",100000),
    GOLD("Gold",100000),
    PLATINUM("Black",100000);

    override fun getCashback(): Float {
        return 0.02f
    }
}

fun getCardType(creditCardType: CreditCardType){
    when(creditCardType){
        CreditCardType.SILVER-> println("Silver")
        CreditCardType.GOLD-> println("Gold")
        CreditCardType.PLATINUM-> println("Platinum")
    }
}

fun main(){
    println(CreditCardType.SILVER)
    println(CreditCardType.SILVER.name)
    println(CreditCardType.SILVER.ordinal)
    println(CreditCardType.SILVER.getCashback())

    println(CreditCardType.GOLD)
    println(CreditCardType.GOLD.name)
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.getCashback())

    println()
    println()

    val creditCardTypes: Array<CreditCardType> = CreditCardType.values()
    creditCardTypes.forEach(::println)

    val creditCards = CreditCardType.valueOf("GOLD")
    println(creditCards)

}