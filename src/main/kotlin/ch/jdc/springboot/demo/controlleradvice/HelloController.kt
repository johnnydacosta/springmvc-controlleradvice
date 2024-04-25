package ch.jdc.springboot.demo.controlleradvice

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@ResponseBody
class HelloController {
    @GetMapping("/hello")
    fun hello(@RequestParam(name = "name", required = false, defaultValue = "World") name: String?): String? {
        return String.format("Hello %s!", name)
    }
}