package jp.eno314.spring.restservice

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    private val TEMPLATE = "Hello, %s!"

    private val counter = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(
            @RequestParam(value = "name", defaultValue = "World")
            name: String
    ) = Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name))
}