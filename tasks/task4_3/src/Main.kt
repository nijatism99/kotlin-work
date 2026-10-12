// Task 4.3: grade calculation using a when expression
import kotlin.math.round
fun main(){
    print("Enter average mark:")
    val mark = readln().toDouble()
    val roundedMark = round(mark).toInt()
    val grade = when (roundedMark){
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?"
    }



    println("Average mark: $roundedMark")
    println("Grade: $mark")
}