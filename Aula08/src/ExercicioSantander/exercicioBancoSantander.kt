package ExercicioSantander

fun main(){
    var cliente01 = Cliente(6409, "Davi", "Teles", 762356, 2225)

    var contaCorrenteCliente01 = ContaCorrente(100.00, cliente01)
    var contaPoupancaCliente01 = ContaPoupanca(2.00, cliente01)

    contaCorrenteCliente01.depositarDinheiro(1000.00)
    contaCorrenteCliente01.consultarSaldo()
    contaPoupancaCliente01.consultarSaldo()
    contaPoupancaCliente01.depositarDinheiro(100.00)
    contaPoupancaCliente01.consultarSaldo()
    contaPoupancaCliente01.recolherJuros()
    contaPoupancaCliente01.consultarSaldo()
}