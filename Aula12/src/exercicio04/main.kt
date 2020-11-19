package exercicio04

fun main() {

    val funcionario01 = Funcionario("David", 1)
    val funcionario02 = Funcionario("Marcos", 2)
    val funcionario03 = Funcionario("Lais", 3)
    val funcionario04 = Funcionario("Aline", 4)
    val funcionario05 = Funcionario("Joao", 4)

    funcionario01.adicionarFuncionarios(funcionario01,funcionario02,funcionario03,
        funcionario04)

    println(funcionario01.listaDeFuncionarios.contains(funcionario05))
}