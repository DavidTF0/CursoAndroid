package exercicio04

class Funcionario(var nome:String, var numeroDeRegistro:Int) {

    var listaDeFuncionarios = mutableListOf<Funcionario>()

    fun adicionarFuncionarios(vararg funcionario: Funcionario){
        listaDeFuncionarios.addAll(funcionario)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroDeRegistro != other.numeroDeRegistro) return false

        return true
    }
}