fun main() {
    // Сумма покупки
    val purchaseAmount = 15000.0

    // Статус покупателя: true - постоянный, false - обычный
    val isRegularCustomer = true

    // Рассчитываем скидку в зависимости от суммы покупки
    val discount: Double = when {
        purchaseAmount < 1000 -> 0.0
        purchaseAmount in 1000.0..10000.0 -> 100.0
        else -> purchaseAmount * 0.05
    }

    // Применяем скидку к сумме покупки
    var discountedAmount = purchaseAmount - discount

    // Если покупатель постоянный, применяем дополнительную скидку
    if (isRegularCustomer) {
        discountedAmount *= 0.99
    }

    // Округляем итоговую сумму до целых
    val roundedDiscountedAmount = discountedAmount.toInt()

    // Выводим в консоль итоговую стоимость покупки
    println("Итоговая стоимость покупки: $roundedDiscountedAmount рублей")
}
