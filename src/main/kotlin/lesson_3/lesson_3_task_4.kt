package lesson_3

fun main() {
    /*
    В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
    Игрок начал партию ходом из E2 в E4.
    Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.

    – Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль.
    Нужно "собрать" единую строку из объявленных переменных и сохранить в новую переменную
    (или сразу распечатывать).
    – Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход.
    Определить, какое значение будет в переменной "куда" для фигуры,
    стоящей на D2 и продвинувшейся на одну клетку вперед.
     */

    var startPositionFigure1 = "E2"
    var newPositionFigure1 = "E4"
    var numberMove = 1

    var dateServerFigure1 = "[$startPositionFigure1-$newPositionFigure1];$numberMove"
    println(dateServerFigure1)

    startPositionFigure1 = "E4"
    newPositionFigure1 = "Е5"
    ++numberMove
    dateServerFigure1 = "[$startPositionFigure1-$newPositionFigure1];$numberMove"

    println(dateServerFigure1)

    var startPositionFigure2 = "D2"
    var newPositionFigure2 = "D3"
    ++numberMove
    var dataServerFigure2 = "[$startPositionFigure2-$newPositionFigure2];$numberMove"
    println(dataServerFigure2)
}