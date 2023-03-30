
package lesson_4

fun main() {
    /*
    На таможенном терминале грузы сортируют по весу и объему. Напиши программу,
    которая определяет – подходит ли груз в категорию Average.
    Параметры категории неизменны: вес от 35 кг до 100 кг включительно, объем до 100 л не включительно.

    Программа должна выводить в консоль информацию.
    Пример вывода: “Average для груза с весом 42 кг и объемом 120 л: false”

    – проинициализировать заранее известные ограничения;
    – определить подходят ли под категорию Average грузы со следующими параметрами: 20кг / 80л и 50кг / 100л;
    – выполнять сравнение сразу внутри println() и без использования диапазонов.
     */
    val cargoWeight1 = 20
    val cargoVol1 = 80

    val cargoWeight2 = 50
    val cargoVol2 = 100

    println("Average для груза с весом $cargoWeight1 кг и объемом $cargoVol1 л: ${(WEIGHT_MIN <= cargoVol1 && cargoWeight1 <= WEIGHT_MAX) && (cargoVol1 < VOL_MAX)}")
    println("Average для груза с весом $cargoWeight2 кг и объемом $cargoVol2 л: ${(WEIGHT_MIN <= cargoVol2 && cargoWeight2 <= WEIGHT_MAX) && (cargoVol2 < VOL_MAX)}")

}

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOL_MAX = 100