package exercicio02

fun main() {

    val novaLista = mutableListOf<Int>()

    novaLista.add(1)
    novaLista.add(5)
    novaLista.add(5)
    novaLista.add(6)
    novaLista.add(7)
    novaLista.add(8)
    novaLista.add(8)
    novaLista.add(8)

    println("mutableListOf: $novaLista")

    val conjuntoVazio = mutableSetOf<Int>()

    conjuntoVazio.add(1)
    conjuntoVazio.add(5)
    conjuntoVazio.add(5)
    conjuntoVazio.add(6)
    conjuntoVazio.add(7)
    conjuntoVazio.add(8)
    conjuntoVazio.add(8)
    conjuntoVazio.add(8)

    println("mutableSetOf: $conjuntoVazio")


}