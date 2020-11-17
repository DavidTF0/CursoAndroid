class Foto(override val nome: String, override val tipoDeDocumento: String):Imprimivel {
    override fun imprimir() {
        println("Eu sou uma selfie\n$nome, Tipo de Documento $tipoDeDocumento")
    }

}