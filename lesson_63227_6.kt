/*


Простые работники посольства пришельцев столкнулись с новой проблемой - принцип сортировки бумаг изменился! Для того чтобы понять, к кому из послов относится сообщение, необходимо найти самое часто употребляемое слово. Оно и будет именем ответственного лица.

Реализуйте функцию calculateWordStat, которая находит самое часто употребляемое слово в строке.

Sample Input 1:

PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM

Sample Output 1:

DTQEHGC

Sample Input 2:

KTTKAP ZSAC RKSLNFE LYAB ZSAC ZSAC NQUZKL LYAB ZSAC KTTKAP ZSAC ZSAC KTTKAP RKSLNFE ZSAC ZSAC RKSLNFE LYAB ZSAC RKSLNFE KTTKAP LYAB RKSLNFE NQUZKL RKSLNFE LYAB RKSLNFE RKSLNFE LYAB RKSLNFE KTTKAP ZSAC RKSLNFE KTTKAP ZSAC LYAB LYAB LYAB RKSLNFE ZSAC

Sample Output 2:

ZSAC

Sample Input 3:

BAMMWC ZTSKPZ LLXMOU BAMMWC BAMMWC BAMMWC IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB LLXMOU GSLXNL BAMMWC GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB IFYXBAB GSLXNL IFYXBAB LLXMOU BAMMWC IFYXBAB ZTSKPZ BAMMWC BAMMWC BAMMWC IFYXBAB LLXMOU

Sample Output 3:

GSLXNL



*/


fun calculateWordStat(input:String): String{
    // enter your function code here
        val words = input.split(" ")
    val frequenciesByFirstChar = words.sorted().groupingBy {it}.eachCount()
        .maxByOrNull({ it: Map.Entry<String, Int> -> it.value}).toString()

    return frequenciesByFirstChar.substringBefore("=")
}