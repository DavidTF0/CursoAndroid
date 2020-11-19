package exercicio01

fun main() {
    val pessoa01 = Pessoa("Joao", 36765)
    val pessoa02 = Pessoa("Jose", 36765)

    println(pessoa01)
    println(pessoa02)

    println(pessoa01.equals(pessoa02))
}