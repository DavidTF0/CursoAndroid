package exercicio02

fun main(){

    var ingresso01 = Ingresso(10.00, 2)



}

fun tipoDeIngresso(ingresso:Ingresso){
    if(ingresso.tipoDoIngresso == 1){
        Normal(ingresso:Ingresso)
    }
}