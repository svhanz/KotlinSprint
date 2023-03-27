package lesson_3

fun main() {
    /*
    Пишем программу, которая будет помогать учить таблицу умножения.
    В отдельную переменную будет записываться число (объявить и проинициализировать),
    а выводиться будет таблица умножения для этого числа.
    Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.

    Пример вывода:
    6 x 1 = 6
    6 x 2 = 12
    …
    6 x 9 = 54

 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
     */
    val initialValue = 4
    val multiplicationTable = """
        $initialValue X 1 = ${initialValue * 1}
        $initialValue X 2 = ${initialValue * 2}
        $initialValue X 3 = ${initialValue * 3}
        $initialValue X 4 = ${initialValue * 4}
        $initialValue X 5 = ${initialValue * 5}
        $initialValue X 6 = ${initialValue * 6}
        $initialValue X 7 = ${initialValue * 7}
        $initialValue X 8 = ${initialValue * 8}
        $initialValue X 9 = ${initialValue * 9}      
    """.trimIndent()
    println(multiplicationTable)
}