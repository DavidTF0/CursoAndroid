package ExercicioSantander

class ContaCorrente(var limiteChequeEspecial:Double, cliente:Cliente): Conta(cliente) {

    fun depositarCheque(cheque:Cheque):Double{
        super.saldo += cheque.valor
        return super.saldo
    }

    fun sacar(valor:Double){
        if((super.saldo + limiteChequeEspecial) > 0) {
            sacarDinheiro(valor)
        }
    }


}