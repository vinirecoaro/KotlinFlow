package br.vini.trainning.kotlin.flow.`01-fundamentals`

import br.vini.trainning.kotlin.flow.utils.printWithTimePassed
import java.math.BigInteger

fun main(){
    val startTime = System.currentTimeMillis()
    calculateFactorialOf(5).forEach {
        printWithTimePassed(it, startTime)
    }

}

private fun calculateFactorialOf(num : Int) : List<BigInteger> = buildList {
    var factorial = BigInteger.ONE
    for(i in 1..num){
        Thread.sleep(10)
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
        add(factorial)
    }
}