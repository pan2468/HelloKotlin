package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listWithNull = listOf(1,null,3,null,5,6)

//    // map: 컬렉션에 주어진 식을 적용해 새로운 컬렉션 반환
//    println(list.map { it * 2 })
//
//    val mapIndexed = list.mapIndexed { index, i -> index * i }
//    println(mapIndexed)
//
//    // mapNotNull: null을 제외하고 식을 적용해 새로운 컬렉션 반환
//    println(listWithNull.mapNotNull { it?.times(2) })

    println(list.flatMap { listOf(it,'A') })
    val result = listOf("abc","12").flatMap { it.toList() }
    println(result)


//    val grpMap = list.groupBy { if(it % 2 == 0) "even" else "odd" }
//    println(grpMap)

}