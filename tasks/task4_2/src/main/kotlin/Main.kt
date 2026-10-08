// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU")
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")
    print("Choose your pizza: ")
    val choice = readln().uppercase()
    if (choice[0] in 'A'..'D'){
        println("Order accepted!")
    
    }else{
        println("Invalid choice!")
    
    }
}
