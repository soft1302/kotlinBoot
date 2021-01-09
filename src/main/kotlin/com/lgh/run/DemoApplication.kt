package com.lgh.run

import com.lgh.run.config.Config
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(Config::class)
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
