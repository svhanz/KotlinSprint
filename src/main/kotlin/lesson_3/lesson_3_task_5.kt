package lesson_3

fun main() {
    /*
    Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
    отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

    Необходимо будет сделать обратное.
    Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
    присвоить соответствующим переменным и распечатать по отдельности.
     */
    val dataServer = "D2-D4;0"
    val delSeparator1 = "-"
    val delSeparator2 = ";"
    val dataServerStr= dataServer.split(delSeparator1, delSeparator2)
    val startPosition = dataServerStr[0]
    val newPosition = dataServerStr[1]
    val numberMove= dataServerStr[2]
    println("Начальная позиция фигуры: $startPosition")
    println("Новая позиция фигуры: $newPosition")
    println("Номер хода: $numberMove")
}



