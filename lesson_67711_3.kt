fun getYearEra(year: Int): String{
    var str:String = when { 
        year >= 2100 -> "distant future"
        year >= 2000 -> "after (XXI century)"
        year > 1970 -> "after (XX century)"
        year == 1970 -> "equals"
        else -> "before"
    }
    
    
    return str
    //enter your function implementation here  
}