package chap03.section5.scope.run

class Person3{
    var name:String="Sumit"
    var age:Int=21
}

fun main() {
    val person:Person3?=Person3()
    person?.run{
        println(this.name)
        println(age)
    }

    //now to return something
    val jobProfile=person?.run{
        println(this.name)
        println(age)
        "Android developer"
    }
    println(jobProfile)

}

