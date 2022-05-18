package chap03.section5.extension

fun List<Int>.getHigherThan(num: Int): List<Int> {
    val result = arrayListOf<Int>()
    for (item in this) {
        if (item > num) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val filtered = numbers.getHigherThan(3).toString()
    System.out.println(filtered)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

