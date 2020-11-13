package ExercicioSantander

open class Conta(cliente: Cliente) {

    var saldo: Double = 0.00

   open fun depositarDinheiro(dinheiro:Double){
        println("Foi depositado $dinheiro")
        saldo += dinheiro
   }

   open fun sacarDinheiro(valorSaque: Double){
        if(saldo > 0){
            saldo -= valorSaque
            println("Foi sacado R$$valorSaque\nSaldo atual R$$saldo")
        }else{
            println("Não é possivel realizar o saque")
        }
    }

    open fun consultarSaldo(){
        println("O Saldo atual é R$$saldo")
    }

}