package exercicio01

fun main() {
    val loteriaDosSonhos = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo",
        4 to "Dentista", 5 to "Fogo")

    println(loteriaDosSonhos)

    val loteriaDosSonhos2 = mutableMapOf<Int, String>()

    loteriaDosSonhos2.put(0, "Ovos")
    loteriaDosSonhos2.put(1, "Água")
    loteriaDosSonhos2.put(2, "Escopeta")
    loteriaDosSonhos2.put(3, "Cavalo")
    loteriaDosSonhos2.put(4, "Dentista")
    loteriaDosSonhos2.put(5, "Fogo")

    println(loteriaDosSonhos2)

    val apelidos = mapOf("João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Night Watch", "Bruce wayne", "Tampinha"),
        "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to listOf("Lukinha", "Jorge", "George"))

    apelidos.forEach{apelido ->
        println(apelido) }


//    println(apelidos)
}


