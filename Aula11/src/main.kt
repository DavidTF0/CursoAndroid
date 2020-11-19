fun main() {

    val foto = Foto("Dia de Sol", "Selfie")
    val documento = Documento("Hora da Aula", "PDF")
    val contrato = Contrato("Compra Audi A1", "PDF")
    val impressora = Impressora()


    impressora.adicionaItemNaLista(foto, documento, contrato)
//    impressora.adicionaItemNaLista(documento)
//    impressora.adicionaItemNaLista(contrato)

    impressora.imprimir()
}