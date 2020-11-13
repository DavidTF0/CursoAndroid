package exercicio02

class Fatura(var listaDeItens: ArrayList<Itens>) {

    fun totalDaFatura():Double{
        var total = 0.0
        for (item in listaDeItens){
            total += item.preco * item.qtdDeItens
        }
        return total

    }
}