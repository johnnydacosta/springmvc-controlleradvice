package ch.jdc.springboot.demo.controlleradvice.advicer

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest


/**
 * Catch all unhandled exception of type Exception and RuntimeException
 */
@ControllerAdvice(name = "Catch All Exception Handler")
@Order(Ordered.LOWEST_PRECEDENCE)
class CatchAllException {

    @ExceptionHandler(value = [Exception::class, RuntimeException::class])
    protected fun handleAny(ex: Exception): ResponseEntity<Any> {
        val bodyOfResponse = "[CatchAllException] - Something bad happened"
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(bodyOfResponse)
    }
}