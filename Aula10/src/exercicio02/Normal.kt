package exercicio02

abstract class Normal(valor:Double, tipo:Int):Ingresso(valor, tipo) {

    fun imprimeIngressoNormal(){
        println("Ingresso Normal")
        valorDoIngresso()
    }
}