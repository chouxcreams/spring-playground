package com.chouxcreams.springplayground.controller

import com.chouxcreams.springplayground.usecase.TestUsecase
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val testUsecase: TestUsecase
) {

    @GetMapping("/test")
    fun test(): String {
        testUsecase.test()
        return "Hello World!"
    }
}