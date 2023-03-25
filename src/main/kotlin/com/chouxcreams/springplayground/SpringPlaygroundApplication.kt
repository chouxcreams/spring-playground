package com.chouxcreams.springplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class SpringPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<SpringPlaygroundApplication>(*args)
}
