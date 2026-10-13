// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
fun circlePerimeter(radius:Double) = 2 * PI * radius

fun main(){
    val perimetir = readln().toDouble()
    println(circlePerimeter(perimetir))
}