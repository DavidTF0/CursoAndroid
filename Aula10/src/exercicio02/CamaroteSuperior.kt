package exercicio02

class CamaroteSuperior(var valorCamaroteSuperior: Double, valor:Double, tipo:Int):Vip (valor, tipo){

    fun PrecoCamaroteSuperior(valorCamaroteSuperior: Double){
        var valorCamarote = valorAdicional + valorCamaroteSuperior
        super.ingressoVip(valorCamarote)
    }
}