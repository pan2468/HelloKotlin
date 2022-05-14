package chap03.section5.scope.let

fun main() {

//    val numbers = mutableListOf("one", "two", "three", "four","five")
//        numbers.map { it.length }.filter { it > 3 }.let {
//        println(it)
//    }

    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}


