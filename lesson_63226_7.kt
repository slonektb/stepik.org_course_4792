/*



Создайте null-безопасную функцию getLength(str: String?):Int , возвращающую длину str, если str не null, и 0 в противном случае.

Из консоли/В консоль ничего читать/писать не нужно!

Sample Input 1:

POUKMONS4W5J5

Sample Output 1:

13

Sample Input 2:

P6VW88MWCU5PDPUN8SNLOL4L7DVGVQNKER1UQ

Sample Output 2:

37

Sample Input 3:

null

Sample Output 3:

0



*/


fun getLength(str: String?):Int?{
    return str?.length?:0
}