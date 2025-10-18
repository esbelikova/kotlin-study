/**
 * Утилитный класс для математических операций.
 *
 * Предоставляет статические методы для базовых вычислений,
 * таких как сложение, нахождение максимума и проверка чётности.
 *
 */
object MathUtils {

    /**
     * Складывает два целых числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма [a] и [b]
     * @throws ArithmeticException если произойдёт переполнение
     * @sample MathUtils.addSample
     */
    @Throws(ArithmeticException::class)
    fun add(a: Int, b: Int): Int {
        return Math.addExact(a, b)
    }

    /**
     * Возвращает максимальное из двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return большее из [a] и [b]
     */
    fun max(a: Int, b: Int): Int = if (a > b) a else b

    /**
     * Проверяет, является ли число чётным.
     *
     * @param number число для проверки
     * @return `true`, если [number] чётное; иначе `false`
     */
    fun isEven(number: Int): Boolean = number % 2 == 0

    /**
     * Пример использования функции [add].
     *
     * ```
     * val result = MathUtils.add(5, 7)
     * println(result) // вывод: 12
     * ```
     */
    fun addSample() {
        val result = add(5, 7)
        println(result)
    }
}
