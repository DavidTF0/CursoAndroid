package exercicio02

class CamaroteInferior(valor:Double, tipo:Int, val localizacaoDoIngresso:String):Vip(valor,tipo){

    fun imprimeLocalizacaoCamaroteInferior(){
        println("O acento esta localizado: $localizacaoDoIngresso")
    }

}