package conceitosBasicos.funcoes

//1. Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.
fun main(){
    print("Atribua um valor inteiro ao x: ")
    val x: Int = readln().toInt()
    print("Agora ao y: ")
    val y: Int = readln().toInt()
    var soma = 0

    for (i in x .. y) {
        if (i % 13 != 0) soma += i
    }
    println("A soma dos intervalos entre os valores atribuídos, inclusive eles, é $soma.")
}