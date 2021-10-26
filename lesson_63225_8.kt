class SugarStorage (var volume:Int = 0) {//....
    fun decreaseSugar(v:Int) {
        if (v < 0) return
        if (v > volume) volume = 0
        else volume -= v
    }
    fun increaseSugar(v:Int) {
        if (v < 0) return
         volume += v
    }
}