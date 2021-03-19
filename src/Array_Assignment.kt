import java.util.*

fun main() {
    strings()
    capitalCities()
    integers()
    println(Arrays.toString(names()))
}
fun strings(){
    var textArrays= arrayOf("Celine","Kigali","Courious","Gushima")
    println(Arrays.toString(textArrays))
}
fun capitalCities() {
    var cities = arrayOf("harare", "mumbai","dodoma", "jakarta")
    cities.forEach {city ->
        println(city.capitalize())
    }
}

fun integers() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[1].plus(numbers[4])
    println(sum)

    var index = numbers.indexOf(158)
    println(index)
    var sortedNumbers= numbers.sortedArray()
    println(Arrays.toString(sortedNumbers))
}
fun names() :Array<String>{
    return arrayOf("Juliet","Sarah","Papai")
}