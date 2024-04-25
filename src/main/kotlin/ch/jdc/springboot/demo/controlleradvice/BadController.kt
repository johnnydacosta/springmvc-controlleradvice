package ch.jdc.springboot.demo.controlleradvice

import ch.jdc.springboot.demo.controlleradvice.exception.AppAException
import ch.jdc.springboot.demo.controlleradvice.exception.AppBException
import ch.jdc.springboot.demo.controlleradvice.exception.GenericAppException
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@ResponseBody
class BadController(
        var badService: BadService,
) {
    @GetMapping("/bad")
    fun bad(@RequestParam(name = "case", required = false, defaultValue = "0") case: Int?): String? {
        when (case) {
            0 -> return "All good!"
            1 -> throw GenericAppException()
            2 -> throw AppAException()
            3 -> throw AppBException()
            else -> return "Use case not implemented!"
        }

    }
}