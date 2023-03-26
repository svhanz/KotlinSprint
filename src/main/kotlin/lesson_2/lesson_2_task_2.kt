package lesson_2

fun main() {
    /*
    В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
    которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии,
    который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
     */
    val permanentEmployees = 50
    val salaryOfPermanentEmployee = 30_000
    var trainees = 30
    var salaryOfTrainee = 20_000
    var totalEmployees = permanentEmployees + trainees

    var totalSalaryOfTrainnes = trainees * salaryOfTrainee
    val totalSalaryPermanentEmployees = permanentEmployees * salaryOfPermanentEmployee
    var totalSalaryInCompany = totalSalaryPermanentEmployees + totalSalaryOfTrainnes
    var averageSalary = totalSalaryInCompany / 80

    println("Общее количество сотрудников компании на текущий момент: $totalEmployees")
    println("Расходы на зарплату постоянным сотрудникам компании: $totalSalaryPermanentEmployees")
    println("Расходы на зарплату стажерам: $totalSalaryOfTrainnes")
    println("Общая сумма выплат по зарплате: $totalSalaryInCompany")
    println("Средняя зарплата сотрудников: $averageSalary")

}