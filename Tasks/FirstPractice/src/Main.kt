fun main() {
    val tracker = ExpenseTracker()

    tracker.addExpense(Expense(100.0, "Food", "2024-09-01"))
    tracker.addExpense(Expense(50.0, "Transport", "2024-09-02"))
    tracker.addExpense(Expense(200.0, "Shopping", "2024-09-03"))
    tracker.addExpense(Expense(150.0, "Food", "2024-09-04"))

    println("All expenses:")
    tracker.printAllExpenses()

    println("\nTotal expenses by category:")
    tracker.printTotalByCategory()
}
