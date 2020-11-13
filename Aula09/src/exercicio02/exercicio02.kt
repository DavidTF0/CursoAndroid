package exercicio02

fun main(){
    var item01 = Itens(1, "caneta",3, 2.0)
    var item02 = Itens(2,"caderno", 2, 10.0)

    var listaDeItens = arrayListOf<Itens>()
    listaDeItens.add(item01)
    listaDeItens.add(item02)

    var fatura01 = Fatura(listaDeItens)

    println(fatura01.totalDaFatura())


}