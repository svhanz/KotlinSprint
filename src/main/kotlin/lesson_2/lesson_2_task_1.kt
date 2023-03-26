package lesson_2

import java.math.RoundingMode
import java.text.DecimalFormat
fun main() {
    // version 1
    val studentFirstValue = 3.0
    val studentSecondValue = 4.0
    val studentThirdValue = 3.0
    val studentFourthValue = 5.0
    val averageValue = (studentFirstValue + studentSecondValue + studentThirdValue + studentFourthValue) / 4
    println("%.2f".format(averageValue))

    // version 2
    val studentFirstValue1 = 3
    val studentSecondValue2 = 4
    val studentThirdValue3 = 3
    val studentFourthValue4 = 5
    val averageValue1 = (studentFirstValue1 + studentSecondValue2 + studentThirdValue3 + studentFourthValue4) / 4
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    println(df.format(averageValue))
}