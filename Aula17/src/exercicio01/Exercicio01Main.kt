package exercicio01

import java.lang.Exception

fun main() {
    val listaDeStrings = listOf<String>("Pato", "Cachorro", "Gato")
    try {
        println(listaDeStrings[3])
    }catch (ex: Exception){
        println(ex.localizedMessage)
        println("valor maior que o indice da lista")
    }


}