package br.vini.trainning.kotlin.flow.`03-terminal_operators`

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.last
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

        val item = flow.last()

        /*Result:
        Emitting first value
        Emitting second value
        Received 2*/

        println("Received $item")
    }



}