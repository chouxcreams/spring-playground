package com.chouxcreams.springplayground.usecase

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Component
import java.util.concurrent.CompletableFuture

interface TestUsecase {
    fun test(): String
}

@Component
class TestUsecaseImpl : TestUsecase {
    override fun test(): String {
        runBlocking {
            launch {
                (1..10).forEach {
                    println("A: $it, ${Thread.currentThread()}")
                    delay(100)
                }
            }
            launch {
                (1..10).forEach {
                    println("B: $it, ${Thread.currentThread()}")
                    delay(100)
                }
            }
            launch {
                (1..10).forEach {
                    println("C: $it, ${Thread.currentThread()}")
                    delay(100)
                }
            }
            CompletableFuture.runAsync {
                (1..10).forEach {
                    println("D: $it, ${Thread.currentThread()}")
                }
            }
            CompletableFuture.runAsync {
                (1..10).forEach {
                    println("E: $it, ${Thread.currentThread()}")
                }
            }

        }
        println()
        return "Hello World!"
    }
}