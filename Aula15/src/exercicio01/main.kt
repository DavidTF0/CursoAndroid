package exercicio01

fun main() {
    val livro01 = Livro(10,"Descobrindo o Kotlin", "Jose", "11/2020", 123,
    20, 20.00)

    val livro02 = Livro(11,"Tentando entender Lambda", "Jose", "11/2020", 456,
    50, 200.00)

    val estoque = Estoque()

    estoque.cadastrarLivro(livro01)
    estoque.cadastrarLivro(livro02)

    estoque.efetuarVenda(11,10)
    estoque.efetuarVenda(11,10)
    estoque.efetuarVenda(11,10)
    estoque.efetuarVenda(11,10)



}