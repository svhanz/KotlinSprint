package lesson_1

fun main() {
    //copied from task 1
    val numberOfOrders: Int = 75
    val thanksText: String = "Thanks for purchase"
    // Task_2 what to do:
    // Для начала выведи в консоль значения всех объявленных ранее переменных
    println("The number of orders is: $numberOfOrders")
    println(thanksText)
    // Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000),
    // Подбери подходящее наименование переменной, присвой ей значение и распечатай;
    var numberOfEmployees: Int = 2000
    // println("The number of employees is: $numberOfEmployees")
    // Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества работников
    // присвой новое значение количества работников этой переменной и распечатай в консоль.
    numberOfEmployees = 1999
    println("The new number of employees is: $numberOfEmployees")
}