package ru.netology

fun main() {
    val typeCard = "Visa"// VKPay, Visa, Mir, Mastercard, Maestro
    val transferLastMonth = 0
    val currentTransfer = 50000
    val comission = calculateComission(typeCard, transferLastMonth, currentTransfer)

    println("Комиссия за перевод составляет: $comission")
}

fun calculateComission(typeCard: String, transferLastMonth: Int, currentTransfer: Int): Any {
    return when(typeCard) {
        "VKPay" -> 0
        "MasterCard", "Maestro" -> if(currentTransfer > 75000) currentTransfer * 0.006 + 20 else 0
        "Visa", "Mir" -> if(currentTransfer * 0.0075 > 35) currentTransfer * 0.0075 else 35
        else -> {0}
    }
}
