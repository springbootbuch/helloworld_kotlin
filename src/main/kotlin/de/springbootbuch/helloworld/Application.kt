package de.springbootbuch.helloworld

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application {
    @RestController
    @RequestMapping(value = "/hello")
    class HelloWorldController {
        @GetMapping
        fun helloWorld(@RequestParam name: String) = "Hello, $name\n"
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}