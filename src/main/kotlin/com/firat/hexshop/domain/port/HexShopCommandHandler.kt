package com.firat.hexshop.domain.port

import com.firat.hexshop.infrastructure.bus.HexshopCommand

interface HexShopCommandHandler<T: HexshopCommand,O>{
    fun handle(t: T): O
    fun getCommandType():Class<T>
}
