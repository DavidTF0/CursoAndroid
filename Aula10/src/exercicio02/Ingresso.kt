package exercicio02

open class Ingresso(var valor:Double, tipoDoIngresso: Int) {

    var tipoDoIngresso: Int = 0

    open fun valorDoIngresso(){
        println("O valor do ingresso é de: R$$valor")
    }
}