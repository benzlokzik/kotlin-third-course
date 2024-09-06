class ExpenseTracker {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(expense: Expense) {
        expenses.add(expense)
    }

    // вывод всех расходов
    fun printAllExpenses() {
        if (expenses.isEmpty()) {
            println("No expenses recorded.")
        } else {
            for (expense in expenses) {
                expense.printInfo()
            }
        }
    }

    // подсчет суммы всех расходов по категориям
    fun printTotalByCategory() {
        val categorySums = mutableMapOf<String, Double>()

        // подсчет
        for (expense in expenses) {
            categorySums[expense.category] = categorySums.getOrDefault(expense.category, 0.0) + expense.amount
        }

        // вывод итоговой суммы по категориям
        for ((category, total) in categorySums) {
            println("Total for $category: $total")
        }
    }
}
