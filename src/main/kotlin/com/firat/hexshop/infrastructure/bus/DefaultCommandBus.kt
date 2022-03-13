package com.firat.hexshop.infrastructure.bus

import com.firat.hexshop.domain.port.CommandBusExecutor
import com.firat.hexshop.domain.port.HexShopCommandHandler
import org.springframework.beans.factory.InitializingBean
import org.springframework.stereotype.Component

@Component
class DefaultCommandBus(private val hexShopCommandHandlers: List<HexShopCommandHandler<out HexshopCommand, out HexshopCommandResult>>)
    : CommandBusExecutor, InitializingBean {

    private val commandHandlerMap: HashMap<Class<*>, HexShopCommandHandler<out HexshopCommand, out HexshopCommandResult>> = hashMapOf()

    override fun afterPropertiesSet() {
        hexShopCommandHandlers.forEach {
            commandHandlerMap[it.getCommandType()] = it
        }
    }

    override fun <T : HexshopCommand, R> execute(command: T): R {
        val hexShopCommandHandler =
            commandHandlerMap[command.javaClass] as HexShopCommandHandler<T, R>
        return hexShopCommandHandler.handle(command)
    }

}




