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

    var startPosition = "E2"
    var newPosition = "E4"
    var numberMove = 1

    var dataServer = "[$startPosition-$newPosition;$numberMove]"
    println(dataServer)

    startPosition = "D2"
    newPosition = "D3"
    ++numberMove
    dataServer = "[$startPosition-$newPosition;$numberMove]"
    println(dataServer)
}