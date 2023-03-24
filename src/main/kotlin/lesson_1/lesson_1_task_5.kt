package lesson_1

import java.util.concurrent.TimeUnit

fun main() {
    // Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
    var wholeSecond = 6480L
    // Переведи количество секунд в целые минуты и сохрани в новую переменную;
    var minuteFromSecond =  wholeSecond / 60
    var partsSecond = wholeSecond % 60
    val formattedTime = String.format("%02d:%02d", minuteFromSecond, partsSecond)
    // Выведи в консоль время, проведенное в космосе в формате [минуты:секунды], например так: 01:09;
    println("Время, проведенное в космосе [минуты:секунды]: $formattedTime")
    // Значения секунд отображать двумя цифрами.
}
