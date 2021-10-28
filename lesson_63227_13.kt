/*


К слову о звездолетах и пришельцах. Благодаря помощи с обучением молодого поколения, пришельцы передали человечеству технологию сверхсветовых двигателей. Однако при ближайшем рассмотрении оказалось, что двигатели не являются надежными в техническом плане (могут расплавить крепление и улететь в космос по своим делам) и по одиночке не работают.

Чтобы пилоты-испытатели не оказались слишком далеко от Земли в неисправном корабле, реализуйте функцию engineStatus(engineNumber:Int): String, которая делает безопасный (с точки зрения необработанных исключений) вызов функции rawEngineStatus(engineNumber:Int):String :

    если произошло исключение EngineNotFoundException, то вернуть строку "engine <number> not found";
    если произошло исключение SensorsMeltException, то вернуть строку "engine <number> offline";
    если не произошло исключение, то вернуть результат работы rawEngineStatus.

где <number> - номер двигателя.

Функцию rawEngineStatus и исключения разрабатывать не нужно!

Из консоли/В консоль ничего читать/писать не нужно!


*/


fun engineStatus(engineNumber:Int): String{

    // Call rawEngineStatus(engineNumber)
    // If exception EngineNotFoundException -  "engine <number> not found"
    // If exception SensorsMeltException - "engine <number> offline"
    // If no exceptions  - return rawEngineStatus output


    return try { rawEngineStatus(engineNumber) } catch (e:EngineNotFoundException) { "engine ${engineNumber} not found" } catch (e:SensorsMeltException) { "engine ${engineNumber} offline" }

}