// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float{
    if (data.isEmpty()){
        throw IllegalArgumentException("cannot calculate the median of an empty list")
    }
    val sorted = data.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 != 0){
        sorted[middle]
    
    }else {
        (sorted[middle-1] + sorted[middle])/2
    }

} 