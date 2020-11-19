package exercicio03

class Aluno(var nome:String, var numeroDeAluno:Int) {

    val listaDeAlunos = mutableListOf<Aluno>()

    fun adicionarAluno(vararg aluno:Aluno){
        listaDeAlunos.addAll(aluno)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numeroDeAluno != other.numeroDeAluno) return false

        return true
    }
}