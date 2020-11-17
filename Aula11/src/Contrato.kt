class Contrato(override val nome: String, override val tipoDeDocumento: String):Imprimivel {
    override fun imprimir() {
        println("“Sou um contrato muito legal”\n$nome, Tipo de Documento $tipoDeDocumento")
    }
}