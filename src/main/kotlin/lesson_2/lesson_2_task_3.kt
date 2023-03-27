package lesson_2

fun main() {
    /*
    Сайт с расписанием поездов получает данные с сервера.
    Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
    Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
     */

    val hourTrainStart = 9
    val minuteTrainStart = 39
    val timeTravelInMinute = 457

    val hourFromTimeTravel = timeTravelInMinute / 60
    val minuteFromTimeTravel = timeTravelInMinute % 60
    val timeArrivalMinuteTotal = minuteFromTimeTravel + minuteTrainStart
    val hourFromTimeArrivalMinute = timeArrivalMinuteTotal / 60

    val timeArrivalHours = hourTrainStart + hourFromTimeTravel + hourFromTimeArrivalMinute
    val timeArrivalMinute = timeArrivalMinuteTotal % 60
    val formattedTimeArrival = String.format("%02d:%02d", timeArrivalHours, timeArrivalMinute)

    println(formattedTimeArrival)

}