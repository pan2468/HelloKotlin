package chap09.section3

fun main() {
    // 가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String,String>
        = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japen" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)

    capitalCityMap.put("Uk","London")
    capitalCityMap.remove("China")
    println(capitalCityMap)

    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)
}
