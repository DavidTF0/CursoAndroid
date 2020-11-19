class Impressora() {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionaItemNaLista(vararg imprimivel: Imprimivel){
        listaImprimivel.addAll(imprimivel)
    }

    fun imprimir(){
        for(tipoDaLista in listaImprimivel){
            println("Item: ${tipoDaLista.nome}, Tipo de Documento: ${tipoDaLista.tipoDeDocumento}")
        }
    }

}