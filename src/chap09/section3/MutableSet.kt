package chap09.section3

fun main() {
    //불변형 Set 정의하기
    val animals = mutableSetOf("Lion","Dog","Cat","Python","Hippo")
    println(animals)

    //요소의 추가
    animals.add("Dog")
    println(animals)

    //요소의 삭제
    animals.remove("Python")
    println(animals)

}
