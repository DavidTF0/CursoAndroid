package exercicio02

abstract class Vip(valor: Double, tipo:Int):Ingresso(valor, tipo) {

    var valorAdicional:Double = 10.00

    fun ingressoVip(valorAdicional: Double){
        super.valor += valorAdicional
    }
}