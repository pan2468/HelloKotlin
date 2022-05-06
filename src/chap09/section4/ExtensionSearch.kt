package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B",200), Pair("C",100), Pair("D",200))
    val listRepeated = listOf(2,2,3,4,5,5,6)

//    //elementAt: 인덱스에 해당하는 요소반환
//    println("elementAt: " + list.elementAt(1))
//
//    //elementAtOrElse: 인덱스를 벗어나는 경우 식에 따라 결과 반환
//    println("elementAtOrElse: " + list.elementAtOrElse(10,{ 2 * it }))
//
//    //elementAtOrNull: 인덱스를 벗어나는 경우 null 반환
//    println("elementAtOrNull: " + list.elementAtOrNull(10))

    //first: 식에 일치하는 첫 요소 반환
    println("first: " + listPair.first{ it.second == 200})

    //last: 식에 일치하는 마지막 요소 반환
    println("last: " + listPair.last{it.second == 200})

    println("firstOrNull: " + listPair.firstOrNull{ it.first == "E"})

    println("lastOrNull: " + listPair.lastOrNull{it.first == "E"})

    println("indexOf: " + list.indexOf(4))

    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 })

    println("lastIndexOf: " + listRepeated.lastIndexOf(5))

    println("indexOfLast: " + list.indexOfLast { it % 2 == 0 })

    println("single: " + listPair.single{it.second == 100})

    println("singleOrNull: " + listPair.singleOrNull{it.second == 500})

    println("binarySearch: " + list.binarySearch (4))

    println("find: " + list.find { it > 3 })

}