package lesson_2

fun main() {
    /*
    В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
    который дает +20% к добытым материалам.
    Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные,
    объявить и проинициализировать.

    Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
    (то есть тех материалов, которые даются “сверху” баффом). По одной строке на материал с его названием.

    Если получается нецелое число, то дробная часть должна отбрасывается.
     */
    val cristalMineral = 7
    val ironMineral = 11
    val baffInPercent = 20


    val cristalMineralWithBaff = cristalMineral + cristalMineral * baffInPercent / 100
    val ironMineralWithBaff = ironMineral + ironMineral * baffInPercent / 100

    val baffCristalMineral =  cristalMineralWithBaff - cristalMineral
    val baffIronMaterial = ironMineralWithBaff - ironMineral
    println("Бонусы кристаллической руды: $baffCristalMineral")
    println("Бонусы железной руды: $baffIronMaterial")
}