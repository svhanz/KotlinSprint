package lesson_4


fun main() {
    /*
    В агрокомплексе установлена автоматизированная система анализа выращивания растений.
    Напиши программу, которая информирует сотрудников о благоприятных условиях для конкретного вида культур.
    Для роста бобовых существует ряд условий, а именно: солнечная погода, раскрытый тент,
    влажность 20% и время года не зима.

    Напиши условие и выведи его результат сообщением такого вида в консоль:
    “Благоприятные ли условия сейчас для роста бобовых? true/false”

    Данные для сегодняшнего дня (объяви и проинициализируй исходные переменные):
    – солнечная погода;
    – тент раскрыт;
    – влажность 20;
    – время года зима.
     */
    // current conditions
    val currentWeather = "sunny"
    val awningStatus = "open"
    val currentHumidity = 20
    val currentSeason = "winter"

    val compareResult = currentWeather == WEATHER_CONDITION
            && awningStatus == AWNING_CONDITION
            && currentHumidity == HUMIDITY_CONDITION
            && currentSeason != SEASON_CONDITION

    println("Благоприятные ли условия сейчас для роста бобовых? $compareResult")
}

    const val WEATHER_CONDITION = "sunny"
    const val AWNING_CONDITION = "open"
    const val HUMIDITY_CONDITION = 20
    const val SEASON_CONDITION = "winter"
