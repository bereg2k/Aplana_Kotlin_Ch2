/** Задание 8: Проценты по вкладу
 * Напишите программу для расчета дохода по вкладу.
 * Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
 * Программа выводит в консоль информацию на сколько будет увеличиваться вклад каждый месяц.
 */
fun main(args: Array<String>) {
    println("Расчет дохода по вкладу.")
    print("Введите сумму вклада: ")
    val sumStart = readLine()!!.toDouble()
    print("Введите длительность вклада (в месяцах): ")
    val duration = readLine()!!.toInt()
    print("Введите ежемесячный процент по вкладу: ")
    val percentRate = readLine()!!.toDouble()
    print("Произвести расчет с капитализацией процентов? [y/n]: ")
    val isCapitalizeInput = readLine()!!

    val isCapitalize = isCapitalizeInput.trim() == "y"
    var sumFinish = sumStart
    println()

    for (i in 1..duration) {
        val increment = (if (isCapitalize) sumFinish else sumStart) * (percentRate / 100)
        sumFinish += increment

        println("Месяц №$i. Сумма вклада увеличится на $increment рублей.")
        println("По итогу месяца сумма вклада составит $sumFinish \n")
    }

    println("Итоговая сумма вклада будет равна $sumFinish рублей.")
}