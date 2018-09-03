package tqi.talk.reactive.demo.blocking.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("tqi.talk.reactive.demo.blocking.controller", "tqi.talk.reactive.demo.blocking.service")
class BlockingDemoApiApplication

fun main(args: Array<String>) {
    runApplication<BlockingDemoApiApplication>(*args)
}
