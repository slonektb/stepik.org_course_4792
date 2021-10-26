fun calculateEvenDigits(input:String): Int{
    // enter your function code here
    var summ:Int = 0
    for (c in input) {
        val s:Int = c.toString().toInt()
        if (s%2 == 0) summ = summ + s
    }
    return summ
}