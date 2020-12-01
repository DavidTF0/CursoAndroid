package exercicio03

class CalculoMatematico {

    fun divisao(dividendo: Int, divisor:Int):Int{
        try {
            return dividendo / divisor
        }catch (ex:ArithmeticException){
            println("ArithmeticException ${ex.message}")
            println("Digite um valor diferente de zero no divisor")
            return 0
        }
    }

    fun divisao2(dividendo: Int, divisor:Int):Int{
        if(divisor != 0) {
            return dividendo / divisor
        }else {
            throw ArithmeticException("Divisor não pode ser 0")
        }
    }
}