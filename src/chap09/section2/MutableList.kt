package chap09.section2

fun main() {
    // 가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("kildong","Dooly","Chelsu")
    mutableList.add("Ben") //추가
    mutableList.removeAt(1) //인덱스 1번 삭제
    mutableList[0] = "Sean" //인덱스 0번을 변경, set(Index:int,element:E)와 같은 역할
    println(mutableList)

    //자료형의 혼합
    val mutableListMixed = mutableListOf("Android","Apple",5,6,'X')
    println(mutableListMixed)

}