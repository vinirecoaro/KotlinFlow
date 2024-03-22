package br.vini.trainning.kotlin.flow.`03-terminal_operators`

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main(){
    val flow = flow {
        delay(100)
        println("Emitting first value")
        emit(1)
        delay(100)
        println("Emitting second value")
        emit(2)
    }

    runBlocking {
        flow.collect{receivedValue ->
            println("Received value $receivedValue")
        }
    }



}