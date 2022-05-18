package chap08.section1

class Calc<T: Number> { //클래스의 형식 매개변수 제한
    fun plus(arg1: T, arg2: T): Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val calc = Calc<Int>()
    println(calc.plus(10,20))


    val cal2 = Calc<Double>()
    val cal3 = Calc<Long>()

    println(cal2.plus(2.5,3.5))
    println(cal3.plus(5L, 10L))
}