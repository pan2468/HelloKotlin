package chap05.section3.override

//상속이 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String){
    //메소드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Parrot(name: String,
             wing: Int = 2,
             beak: String,
             color: String, //마지막 인자면 var로 선언되어 프로퍼티가 추가되었음을 알 수 있음
             var language: String = "natural") : Bird(name,wing,beak,color){

                 fun speak() = println("Speak! $language") // Parrot에 추가한 메소드
                override fun sing(vol : Int){ //오버라이딩된 메소드
                    println("I'm a parrot! The volume level is $vol")
                    speak() //달라진 내용
                 }
             }

fun main() {
    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color},${parrot.language}")
    parrot.sing(5)
}