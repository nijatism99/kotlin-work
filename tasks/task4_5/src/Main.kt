// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val n = readln().toInt()
    var s = 0
    for (i in 1..n step 2){
        
        s+=i
    
    }
    println(s)
}   
