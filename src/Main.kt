/** Задание 9: Массив Стран
 * Создайте многомерный массив, где в первом массиве хранится названия каких-либо стран,
 * в следующем столицы данных стран и в последнем массиве используемая денежная единица.
 * Сохраните информацию минимум по 3 странам и выведите в консоль в виде:
 * Страна          Столица        Валюта
 */
fun main(args: Array<String>) {

    // Создание массива
    val countriesArray = Array(3, { Array(3, { "" }) })
    countriesArray[0] = arrayOf("Russia", "USA", "Japan")
    countriesArray[1] = arrayOf("Moscow", "Washington, DC", "Tokyo")
    countriesArray[2] = arrayOf("RUR", "USD", "JPY")

    // Создание переменных для заголовка таблицы
    val countryLabel = "Country"
    val capitalLabel = "Capital"
    val currencyLabel = "Currency"
    var space = ""; for (i in 1..20) space += " "
    val header = countryLabel + space + capitalLabel + space + currencyLabel

    // Печать заголовка
    println(header)
    for (i in 1..header.length) print("_")
    println()

    // Печать содержимого массива в таблицу
    for (i in 0..(countriesArray.size - 1)) {
        for (j in 0..(countriesArray.size - 1)) {
            print(countriesArray[j][i])

            // Дополнительный цикл для динамического выравнивания текста в таблице
            for (k in 1..(27 - countriesArray[j][i].length))
                print(" ")
        }
        println()
    }
}