package exercicio03

fun main() {


    val aluno01 = Aluno("alice", 1)
    val aluno02 = Aluno("David", 2)
    val aluno03 = Aluno("Lais", 3)
    val aluno04 = Aluno("Marcos", 4)
    val aluno05 = Aluno("Aline", 4)

    aluno01.adicionarAluno(aluno01,aluno02,aluno03,aluno04)

    println(aluno01.listaDeAlunos.contains(aluno05))

}