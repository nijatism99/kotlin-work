// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
   val initialTemperature = args[0].toDouble()
   val maximumTemperature = args[1].toDouble()
   val increment = args[2].toDouble()
   var temperature = initialTemperature
   var farenheit = 0
   while (temperature <= maximumTemperature){
    var farenheit = (temperature * 9.0 / 5.0) + 32.0
    println("%8.1f".format(temperature))
    
    temperature += increment
     
    
   }
   

   
}
