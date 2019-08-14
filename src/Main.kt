/** Задание 7: Тест
 * Напишите тест на любую тему.
 * Пользователь должен вводить номер варианта из предложенных ответов.
 * Придумайте минимум 5 вопросов.
 * Вывод результата тестирования должен происходить через оператор when, в виде текстового комментария
 * (прим: «Ваши знания истории на крепкую четверку»).
 */
fun main(args: Array<String>) {
    var grade = 0 // Количество баллов за тест. Увеличивается на 1 с каждым верным ответом

    println("Перед вами простой тест по истории с 3 вариантами ответа.")

    println("Вопрос 1. Крещение на Руси произошло в ... году. ")
    print("1) 792 \n" + "2) 988 \n" + "3) 1147 \n" + "4) 899 \n")
    var answer = readLine()!!
    if (answer == "2") {
        grade++
    }

    println("Вопрос 2. Коллекцию русской живописи, получившую в дальнейшем мировую известность," +
            "в 1856 году начинает собирать ... ")
    print("1) П.М. Третьяков\n" + "2) П.Н. Демидов \n" + "3) Александр I\n" + "4) С.И. Мамонтов\n")
    answer = readLine()!!
    if (answer == "1") {
        grade++
    }

    println("Вопрос 3. Многочисленные представители этой тяжелой профессии делились на «лихачeй» и «ванек».\n" +
            "«Лихачи» были более высокооплачиваемой категорией.\n" +
            "О какой профессии идет речь? ")
    print("1) Шофер \n" + "2) Извозчик \n" + "3) Кучер \n" + "4) Машинист поезда\n")
    answer = readLine()!!
    if (answer == "2") {
        grade++
    }

    println("Вопрос 4. Военное учебное заведение в Санкт- Петербурге, учреждённое императрицей Анной Иоанновной в 1731 году.")
    print("1) Школа математических и навигационных наук\n" + "2) Военное училище \n" + "3) Первый кадетский корпус\n" + "4) Колегии\n")
    answer = readLine()!!
    if (answer == "3") {
        grade++
    }

    println("Вопрос 5. В 18 веке в России так называли собрания-балы с участием женщин в домах знати,\n" +
            "введённые и регламентированные в 1718 году Петром 1 Великим.")
    print("1) Бал \n" + "2) Парламент \n" + "3) Собрание \n" + "4) Ассамблеи \n")
    answer = readLine()!!
    if (answer == "4") {
        grade++
    }

    when (grade) {
        in 0..2 -> print("Увы, незачёт! Вам есть куда стремиться в вашем развитии!")
        3 -> print("Неплохо! У вас неплохой потенциал в изучении истории!")
        4 -> print("Хорошо! Ваши знания на крепкую четверку!")
        5 -> print("Вау! Вашим знаниям можно только позавидовать! В Гугл подглядывали? ;)")
    }
}