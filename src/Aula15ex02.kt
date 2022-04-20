package conceitosBasicos.funcoes

/*2. Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor de tamanho 10.
 Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1,
 os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.*/

fun main(){
    mostraVetor(preencheVetor())
}

fun mostraVetor(listaNumeros: IntArray){
    for (i in listaNumeros.indices)
        println("Posição nº ${i+1}: ${listaNumeros[i]}")
}

fun preencheVetor(): IntArray {
    val listaNumeros = IntArray(10)
    print("Defina o valor da primeira posição da lista: ")
    listaNumeros[0] = readln().toInt()
    for (i in 1..9) {
        listaNumeros[i] = listaNumeros[i - 1] * 2
    }
    return listaNumeros
}