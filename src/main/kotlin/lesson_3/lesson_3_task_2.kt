package lesson_3

fun main() {
    /*
    Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова и поменяла фамилию.
    О ней есть запись в одном из государственных приложений.
    Приложение отслеживает изменения персональных данных граждан.

    Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
    Все части ФИО и возраст изначально хранятся в отдельных переменных.
     */
    var girlAge = 20
    val girlName = "Татьяна"
    val girlSurname = "Сергеевна"
    var girlLastName = "Андреева"
    println("$girlLastName $girlName $girlSurname, $girlAge")
    girlAge = 22
    girlLastName = "Сидорова"
    println("$girlLastName $girlName $girlSurname, $girlAge")
}
