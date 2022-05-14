package chap03.section5.scope.apply

class Person2{
    var name:String=""
    var age:Int=0
}

fun main() {

    val person2=Person2().apply {
        name="Sumit"
        age=21

    }
    with(person2){
        println(name)
        println(age)
    }
}