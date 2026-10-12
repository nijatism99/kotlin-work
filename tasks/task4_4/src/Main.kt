// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    val terminal = Terminal()
val a = terminal.textAnimation<Int> { frame -> (1..50).joinToString("") {
        val hue = (frame + it) * 3 % 360
        TextColors.hsv(hue, 1, 1)("━")
    }
}

terminal.cursor.hide(showOnExit = true)
repeat(120) {
    a.update(it)
    Thread.sleep(25)
}
}
