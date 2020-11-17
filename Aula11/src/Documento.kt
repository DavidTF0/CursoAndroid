class Documento(override val nome: String, override val tipoDeDocumento: String):Imprimivel {
    override fun imprimir() {
        println("Eu sou um documento word\n$nome, Tipo de Documento $tipoDeDocumento")
    }
}