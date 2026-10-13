// Task 7.3.1: list element access
fun main(){
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    val number_slice = numbers.slice(2..4)
    println(numbers)
    println(numbers[0])
    println(numbers[10])
    println(number_slice)
    println(numbers.first)
    println(numbers.last)
    var numbers[0] = 100
    println(numbers[0])    
}