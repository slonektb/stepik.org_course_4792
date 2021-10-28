/*


Отметьте выражения, после  выполнения которых переменная b никогда не станет null, при условии что:

var a: String? = null



*/

//правильные ответы
var b = a?. length ?: 0
var b = if (a != null) a.length else 0
var b = if (a?.length !=null) a!!.length else -1
var b = a!!.length 