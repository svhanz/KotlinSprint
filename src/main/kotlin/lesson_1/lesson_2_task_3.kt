package lesson_1
import java.time.LocalTime

fun main() {
    /*
    Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
    а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
     */

    val timeDepartureTrain = LocalTime.of(9, 39)
    val timeTravel = 457
    val hourFromMinute: Long = (timeTravel / 60).toLong()
    println(hourFromMinute)
    val remainingMinutes:Long = (timeTravel % 60).toLong()
    println(remainingMinutes)
    val timeArrivalHours = timeDepartureTrain.plusHours(hourFromMinute)
    println(timeArrivalHours)
    val timeArrivalMinute = timeDepartureTrain.plusMinutes(remainingMinutes)
    println(timeArrivalMinute)

    //val timeArrivalTrain = String.format("%02f:%02f", timeArrivalHours, timeArrivalMinute)
    // println(timeArrivalTrain)



}