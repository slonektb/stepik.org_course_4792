fun calculateBugMentions(input:List<String>): Int{
    // enter your function code here
    var sum:Int = 0
    for (str in input) {
        if (str == "BUG") sum++
    }
    return sum
}