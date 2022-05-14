package chap03.section5.scope

class Person(var name: String, var age: Int)

fun main() {
    val person = Person("홍길동",30)

    //this 를 참조
    person.run {
        println("이름 : ${this.name}") // this.name 과 동일
    }

    //it 참조
    person.let {
        println("이름 : ${it.name}")
    }
}
