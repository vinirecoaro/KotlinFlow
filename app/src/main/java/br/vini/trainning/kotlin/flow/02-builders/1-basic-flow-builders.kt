package br.vini.trainning.kotlin.flow.`02-builders`

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

suspend fun main() {
    val firstFlow = flowOf<Int>(1).collect{emittedValue ->
        println("firstFlow: $emittedValue")
    }

    val secondFlow = flowOf<Int>(1,2,3)

    secondFlow.collect{emittedValues ->
        println("secondFlow: $emittedValues")
    }

    listOf("A","B","C").asFlow().collect{emittedValues ->
        println("asFlow: $emittedValues")
    }

    flow{
        delay(2000)
        emit("item emmited after 2000ms")

        /*secondFlow.collect{emmittedValues ->
           emit(emmittedValues)
        }*/

        emitAll(secondFlow)

    }.collect { emmitedValue ->
        println("flow{}: $emmitedValue")
    }
}
