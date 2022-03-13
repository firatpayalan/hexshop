package com.firat.hexshop.application

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {

    @GetMapping("/ping")
    fun healthcheck(): ResponseEntity<Any> {
        return ResponseEntity.ok("pong")
    }
}