package br.vini.trainning.kotlin.flow.`01-fundamentals`

import java.math.BigInteger

fun main(){
    val result = calculateFactorialOf(5)
    println("Result: $result")
}

private fun calculateFactorialOf(num : Int) : BigInteger {
    var factorial = BigInteger.ONE
    for(i in 1..num){
        Thread.sleep(10)
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    return factorial
}