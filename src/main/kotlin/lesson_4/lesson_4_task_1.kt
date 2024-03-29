package lesson_4

fun main() {
    /*
    На сайте ресторана есть онлайн бронирование. Бронирование доступно, когда есть свободные столики.
    Всего в ресторане 13 столов и их количество всегда неизменно. На сегодня забронированы все столики.
    А на завтра осталось еще 4 свободных.

    Напиши программу, которая сообщает информацию о бронировании в момент запроса,
    путем сравнения данных о свободных столах с данными о столах в ресторане.

 – Создать переменные с количеством забронированных столов на сегодня и на завтра;
 – Вывести в консоль сообщение о доступности столиков в одном println();
 – Каждое сообщение с новой строки (НЕ использовать многострочный вывод (“”” “””));
 – Формат сообщений такой:
   [Доступность столиков на сегодня: true/false], [Доступность столиков на завтра: true/false].
     */
    val todayBookedTable = 13
    val tomorrowBookedTable = 9

    val todayCheckAvailability = todayBookedTable < TOTAL_TABLE
    val tomorrowCheckAvailability = tomorrowBookedTable < TOTAL_TABLE
    println("[Доступность столиков на сегодня: $todayCheckAvailability], [Доступность столиков на завтра: $tomorrowCheckAvailability]")

}

const val TOTAL_TABLE = 13