import kotlin.math.sqrt
import kotlin.math.pow
import java.time.format.DateTimeParseException

// 1. Нахождение максимума
fun findMax(a: Int, b: Int): Int {
    if (a == b) throw Exception("Числа равны")
    return if (a > b) a else b
}

// 2. Калькулятор деления
fun divide(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a / b
}

// 3. Конвертер строк в числа
fun convertToInt(value: String): Int {
    return value.toIntOrNull() ?: throw NumberFormatException("Неверный формат числа")
}

// 4. Проверка возраста
fun checkAge(age: Int) {
    if (age < 0 || age > 150) throw IllegalArgumentException("Возраст должен быть от 0 до 150")
}

// 5. Нахождение корня
fun findRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Корень из отрицательного числа не определён")
    return sqrt(number)
}

// 6. Факториал
fun factorial(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Факториал отрицательного числа не определён")
    var result = 1
    for (i in 1..n) result *= i
    return result
}

// 7. Проверка массива на нули
fun checkArrayForZeros(array: IntArray) {
    if (array.contains(0)) throw IllegalArgumentException("Массив содержит нули")
}

// 8. Калькулятор возведения в степень
fun power(base: Int, exponent: Int): Int {
    if (exponent < 0) throw IllegalArgumentException("Отрицательная степень недопустима")
    return base.toDouble().pow(exponent).toInt()
}

// 9. Обрезка строки
fun truncateString(value: String, length: Int): String {
    if (length > value.length) throw IllegalArgumentException("Число символов превышает длину строки")
    return value.substring(0, length)
}

// 10. Поиск элемента в массиве
fun findElement(array: IntArray, element: Int): Int {
    return array.indexOf(element).takeIf { it >= 0 } ?: throw Exception("Элемент не найден")
}

// 11. Конвертация в двоичную систему
fun toBinaryString(number: Int): String {
    if (number < 0) throw IllegalArgumentException("Отрицательные числа недопустимы")
    return number.toString(2)
}

// 12. Проверка делимости
fun isDivisible(a: Int, b: Int): Boolean {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a % b == 0
}

// 13. Чтение элемента списка
fun getElementAt(list: List<Int>, index: Int): Int {
    if (index !in list.indices) throw IndexOutOfBoundsException("Индекс выходит за пределы списка")
    return list[index]
}

// 14. Парольная проверка
fun checkPassword(password: String) {
    if (password.length < 8) throw Exception("Слабый пароль")
}

// 15. Проверка даты
fun isValidDate(date: String): Boolean {
    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    if (!regex.matches(date)) throw DateTimeParseException("Неверный формат даты", date, 0)
    return true
}

// 16. Конкатенация строк
fun concatenateStrings(a: String?, b: String?): String {
    if (a == null || b == null) throw NullPointerException("Строка равна null")
    return a + b
}

// 17. Остаток от деления
fun remainder(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a % b
}

// 18. Квадратный корень
fun squareRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Отрицательные числа недопустимы")
    return sqrt(number)
}

// 19. Конвертер температуры
fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) throw IllegalArgumentException("Температура ниже абсолютного нуля")
    return celsius * 9 / 5 + 32
}

// 20. Проверка строки на пустоту
fun checkString(value: String?) {
    if (value.isNullOrEmpty()) throw Exception("Строка пустая или null")
}

fun main() {
    // 1. Проверка функции для нахождения максимума
    try {
        println("Максимум: ${findMax(10, 20)}")
        println("Максимум (равные числа): ${findMax(10, 10)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 2. Проверка функции деления
    try {
        println("Деление: ${divide(10, 2)}")
        println("Деление на ноль: ${divide(10, 0)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 3. Конвертер строк в числа
    try {
        println("Конвертация строки в число: ${convertToInt("123")}")
        println("Конвертация некорректной строки: ${convertToInt("abc")}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 4. Проверка возраста
    try {
        checkAge(25)
        checkAge(200) // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 5. Нахождение корня
    try {
        println("Корень: ${findRoot(16.0)}")
        println("Корень из отрицательного числа: ${findRoot(-16.0)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 6. Факториал
    try {
        println("Факториал: ${factorial(5)}")
        println("Факториал отрицательного числа: ${factorial(-5)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 7. Проверка массива на нули
    try {
        checkArrayForZeros(intArrayOf(1, 2, 3))
        checkArrayForZeros(intArrayOf(1, 0, 3)) // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 8. Возведение в степень
    try {
        println("Возведение в степень: ${power(2, 3)}")
        println("Отрицательная степень: ${power(2, -3)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 9. Обрезка строки
    try {
        println("Обрезанная строка: ${truncateString("Hello, Kotlin!", 5)}")
        println("Длина больше строки: ${truncateString("Hello", 10)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 10. Поиск элемента в массиве
    try {
        println("Элемент найден: ${findElement(intArrayOf(1, 2, 3), 2)}")
        println("Элемент не найден: ${findElement(intArrayOf(1, 2, 3), 5)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 11. Конвертация в двоичную систему
    try {
        println("Двоичное представление: ${toBinaryString(10)}")
        println("Двоичное представление отрицательного числа: ${toBinaryString(-10)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 12. Проверка делимости
    try {
        println("Делится ли 10 на 2: ${isDivisible(10, 2)}")
        println("Деление на 0: ${isDivisible(10, 0)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 13. Чтение элемента списка
    try {
        println("Элемент списка: ${getElementAt(listOf(1, 2, 3), 1)}")
        println("Индекс вне диапазона: ${getElementAt(listOf(1, 2, 3), 5)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 14. Парольная проверка
    try {
        checkPassword("password123")
        checkPassword("short") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 15. Проверка даты
    try {
        isValidDate("01.01.2023")
        isValidDate("2023-01-01") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 16. Конкатенация строк
    try {
        println("Конкатенация: ${concatenateStrings("Hello, ", "world!")}")
        println("Одна строка null: ${concatenateStrings(null, "world!")}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 17. Остаток от деления
    try {
        println("Остаток от деления: ${remainder(10, 3)}")
        println("Деление на ноль: ${remainder(10, 0)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 18. Квадратный корень
    try {
        println("Квадратный корень: ${squareRoot(9.0)}")
        println("Квадратный корень отрицательного числа: ${squareRoot(-9.0)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 19. Конвертер температуры
    try {
        println("Температура в Фаренгейтах: ${celsiusToFahrenheit(0.0)}")
        println("Температура ниже абсолютного нуля: ${celsiusToFahrenheit(-300.0)}") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }

    // 20. Проверка строки на пустоту
    try {
        checkString("Kotlin")
        checkString("") // Исключение
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }
}