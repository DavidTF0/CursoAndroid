package exercicio03

 class Prova() {

    fun somaTotal(set: Set<Int>){
        var soma:Int = 0

        set.forEach{soma += it}

        println(soma)
    }
}