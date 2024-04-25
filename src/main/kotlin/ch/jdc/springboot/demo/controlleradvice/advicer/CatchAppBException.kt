package ch.jdc.springboot.demo.controlleradvice.advicer

import ch.jdc.springboot.demo.controlleradvice.exception.AppAException
import ch.jdc.springboot.demo.controlleradvice.exception.AppBException
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest


/**
 * Catch all specific exception
 */
@ControllerAdvice(name = "Catch App B Exception Handler")
@Order(Ordered.HIGHEST_PRECEDENCE)
class CatchAppBException {

    @ExceptionHandler(AppBException::class)
    protected fun handleAny(ex: Exception): ResponseEntity<Any> {
        val bodyOfResponse = "[CatchAppBException] - Something bad happened"
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyOfResponse)
    }
}