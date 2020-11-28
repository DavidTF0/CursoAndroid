package exercicio01

class Estoque() {
    val listaDeLIvros = mutableListOf<Livro>()

    fun cadastrarLivro(livro: Livro){
        listaDeLIvros.add(livro)
    }

    fun consultarLivro(codigo:Int){
        for(livro in listaDeLIvros){
            if(livro.codigo == codigo){
                println(livro.toString())
            }else{
                println("livro não encontrado")
            }
        }
    }

    fun efetuarVenda(codigo: Int, quantidade:Int){
        for(livro in listaDeLIvros) {
            if (livro.codigo == codigo && livro.quantidade != 0 ) {
                if(livro.quantidade >= quantidade){
                    livro.quantidade -= quantidade
                    println("${livro.toString()} venda realizada")
                }
            } else {
                println("livro não encontrado")
            }
        }
    }

}