package chap09.section2

fun main() {
    val fruits = listOf("apple","banana","kiwi")
//    for(item in fruits){
//        println(item)
//    }
    for(index in fruits.indices){ // 인덱스 지정
        println("fruits[$index] = ${fruits[index]}")
    }
}