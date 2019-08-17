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
    val maxLength = 30 // максимальная длина элемента в таблице

    // Промежутки между 1 и 2 столбцами в зависимости от максимальной длины элемента и длины их заголовков
    var spaceOne = ""; for (i in 1..maxLength - countryLabel.length) spaceOne += " "
    var spaceTwo = ""; for (i in 1..maxLength - capitalLabel.length) spaceTwo += " "

    // Формирование заголовка
    val header = countryLabel + spaceOne + capitalLabel + spaceTwo + currencyLabel

    // Печать заголовка
    println(header)
    for (i in 1..maxLength * countriesArray.size) print("-")
    println()

    // Печать содержимого массива в таблицу
    for (i in 0..(countriesArray.size - 1)) {
        for (j in 0..(countriesArray.size - 1)) {
            print(countriesArray[j][i])

            // Дополнительный цикл для динамического выравнивания текста в таблице в зависимости от длины элемента
            for (k in 1..(maxLength - countriesArray[j][i].length))
                print(" ")
        }
        println()
    }
}