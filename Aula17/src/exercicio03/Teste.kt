package exercicio03



fun main() {
    val calculadora = CalculoMatematico()

//    calculadora.divisao(2,0)
//    println()
//    calculadora.divisao2(4,0)

    try {
        calculadora.divisao(4,0)
    }catch (ex:ArithmeticException){
        println(ex.message)
    }



}