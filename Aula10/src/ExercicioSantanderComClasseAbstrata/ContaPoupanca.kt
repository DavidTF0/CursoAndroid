package ExercicioSantanderComClasseAbstrata

class ContaPoupanca(var taxaDeJuros:Double,cliente: Cliente): Conta(cliente) {

    fun recolherJuros() {
        var juros = ((taxaDeJuros / 100.00)+1)
        super.saldo *= juros
    }
}