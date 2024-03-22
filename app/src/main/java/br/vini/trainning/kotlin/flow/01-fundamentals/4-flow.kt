package br.vini.trainning.kotlin.flow.`01-fundamentals`

import br.vini.trainning.kotlin.flow.utils.printWithTimePassed
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.math.BigInteger

fun main() = runBlocking{
    val startTime = System.currentTimeMillis()

    launch {
        calculateFactorialOf(5).collect() {
            printWithTimePassed(it, startTime)
        }
    }

    println("Ready for more work!")

}

private fun calculateFactorialOf(num : Int) : Flow<BigInteger> = flow {
    var factorial = BigInteger.ONE
    for(i in 1..num){
        delay(10)
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
        emit(factorial)
    }
}.flowOn(Dispatchers.IO)