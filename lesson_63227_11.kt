/*


Каждый банк в туманности Краба оборудован двумя тревожными кнопками. Первая кнопка предназначена для котиков - в данной туманности они являются опасными бандитами. Вторая кнопка - для собачек, поскольку некоторые жители  туманности могут не выдержать уровня их мимишности.
Необходимо реализовать функцию checkClient(client : String), которая:

    генерирует DogException в случае, если аргумент client содержит слово "dog"
    генерирует CatException в случае, если аргумент client содержит слово "cat"

﻿Во всех прочих ситуациях ничего делать не нужно.
Из консоли/В консоль ничего читать/писать не нужно!


*/


class DogException() : Exception()
class CatException() : Exception()
// write your code here
fun checkClient(client:String) {
    if(client == "dog") throw DogException()
    if(client == "cat") throw CatException()
}