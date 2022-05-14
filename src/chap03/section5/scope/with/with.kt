package chap03.section5.scope.with

fun main() {
//    val numbers = mutableListOf("one", "two", "three")
//    with(numbers) {
//        println("'with' is called with argument $this")
//        println("It contains $size elements")
//    }

    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)
}
