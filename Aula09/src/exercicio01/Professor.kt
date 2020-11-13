package exercicio01

class Professor(var nomeDoProfessor:String, val registroDocente:String) {

    fun darAulas(aula:Aula){
        println("vou iniciar a aula de ${aula.materia.nomeDaMateria}")
    }

    fun fazerChamada(aula: Aula){
        println("Vou fazer a chamada da ${aula.materia.nomeDaMateria}")
    }
}