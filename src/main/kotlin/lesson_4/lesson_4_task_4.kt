package lesson_4

fun main() {
    /*
    Программа тренировок разбивает упражнения на несколько групп: упражнения для мышц рук, ног, спины и пресса.
    Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук и пресса.
    Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.

    Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
    Выведи сообщение для пятого дня в виде нескольких красивых ровных строк.

    Вывод должен быть таким:
    Упражнения для рук:       true
    Упражнения для ног:       false
    Упражнения для спины:  false
    Упражнения для пресса: true

    – Все сообщение должно печататься в одном println();
    – При изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.
     */
    val dayNumber = 6
    val compareDay = dayNumber % 2

    val handsExercises = 1
    val legExercises = 2
    val backExercises = 2
    val absExercises = 1

    println("День тренировки: $dayNumber") // моя отсебятина для понимания какой день трени
    println("Упражнения для рук: ${dayNumber == handsExercises || handsExercises == compareDay}")
    println("Упражнения для ног: ${dayNumber == legExercises || legExercises == compareDay + 2}")
    println("Упражнения для спины: ${dayNumber == backExercises || backExercises == compareDay +2}")
    println("Упражнения для пресса: ${dayNumber == absExercises || absExercises == compareDay}")
}