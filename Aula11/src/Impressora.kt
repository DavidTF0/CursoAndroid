class Impressora() {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionaItemNaLista(imprimivel: Imprimivel){
        listaImprimivel.add(imprimivel)
    }

    fun imprimir(){
        for(tipoDaLista in listaImprimivel){
            println("Item: ${tipoDaLista.nome}, Tipo de Documento: ${tipoDaLista.tipoDeDocumento}")
        }
    }

}