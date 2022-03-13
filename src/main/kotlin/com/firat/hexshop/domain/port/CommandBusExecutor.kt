package com.firat.hexshop.domain.port

import com.firat.hexshop.infrastructure.bus.HexshopCommand

interface CommandBusExecutor {
    fun <T: HexshopCommand,R> execute (command: T): R
}