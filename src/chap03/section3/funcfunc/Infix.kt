package chap03.section3.funcfunc



fun main() {

//    val monday: Pair<String, String> = "Monday" to "월요일"
//    println(monday)
    val pair : Pair<String, String> = "White" to "0xffffff"
    println(pair)

    val map1 = mapOf(Pair("key1", "value1"), Pair("key2", "value2"))
    val map2 = mapOf("key1" to "value1", "key2" to "value2")

    println(map1)
    println(map2)

    infix fun String.add(other:String): String {
        return this + other
    }

}