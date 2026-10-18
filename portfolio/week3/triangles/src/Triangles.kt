

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>


fun isValidTriangle(triangle: Triangle): Boolean{
    
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    return (a+b>c) && (a+c>b) && (b+c>a) // checking if the triangle is valid or not(sum of 2 sides cannot be smaller than the other side)
}

fun triangleArea(triangle: Triangle):Double {
    if (!isValidTriangle(triangle)){
        throw IllegalArgumentException("Invalid triangle") //flags it when the triangle is invalid
    }
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    val s = 0.5*(a+b+c)
    val area = sqrt(s* (s-a) * (s-b) * (s-c))
    return area
}