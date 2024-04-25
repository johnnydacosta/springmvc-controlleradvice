package ch.jdc.springboot.demo.controlleradvice

import org.springframework.stereotype.Service

@Service
class BadService {

    fun getDefaultName(): String {
        return "default"
    }
}