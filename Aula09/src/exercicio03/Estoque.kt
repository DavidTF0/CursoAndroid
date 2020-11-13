package exercicio03

class Estoque(var nomeDoProduto:String, var qtdAtual:Int, var qtdMinima:Int) {

    fun mudarNome(nome:String){
        nomeDoProduto = nome
    }

    fun mudarQtdMinima(qtd: Int){
        qtdMinima = qtd
    }

    fun repor(qtd:Int){
        qtdAtual = qtd

    }

    fun darBaixa(qtd:Int){
        qtdAtual -= qtd

    }

    fun mostra():String{
       var mostrar = println("Produto: $nomeDoProduto, Quantidade Minima no Estoque: $qtdMinima Quantidade Atual no Estoque: $qtdAtual")
        return mostrar.toString()
    }

    fun precisaRepor():Boolean{
        return qtdAtual <= qtdMinima
    }





}