data class Expense(
    val amount: Double,       // расход
    val category: String,     // категория расхода
    val date: String          // дата расхода
) {
    fun printInfo() {
        println("Expense: $amount | Category: $category | Date: $date")
    }
}
