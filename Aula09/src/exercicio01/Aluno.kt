package exercicio01


class Aluno(val registroAcademico:String, val nome:String, val sobrenome:String) {

    fun podeAssistirAula(aula: Aula){
        println("vou assistir a aula de ${aula.materia.nomeDaMateria}")

    }

    fun fazerLicaoDeCasa(aula: Aula){
        println("iniciar a lição da ${aula.materia.nomeDaMateria}")

    }
}