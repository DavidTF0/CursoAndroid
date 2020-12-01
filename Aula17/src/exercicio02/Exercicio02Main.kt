package exercicio02

import java.lang.Exception

fun main() {
    var listaDeStrings = listOf<String?>(null)

    listaDeStrings = listOf("Pato", "Cachorro", "Gato")

    try {
        println(listaDeStrings[2])
    }catch (ex:ArrayIndexOutOfBoundsException){
        println(ex.localizedMessage)
        println("valor indice maior que o Tamanho da lista: ${listaDeStrings.size}")
    }

    listaDeStrings = listOf(null)

    try {
        println(listaDeStrings[5])
    }catch(ex: IndexOutOfBoundsException){
        println(ex.localizedMessage)
        println("valor indice maior que o Tamanho da lista: ${listaDeStrings.size}")
    }

}