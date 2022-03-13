package com.firat.hexshop.domain.interaction.additem

import com.firat.hexshop.domain.port.HexShopCommandHandler
import com.firat.hexshop.domain.port.ItemPort
import org.springframework.stereotype.Component

@Component
class AddCommandHandler(
    private val itemPort: ItemPort
): HexShopCommandHandler<AddItemCommand, AddItemCommandResult> {

    override fun handle(t: AddItemCommand): AddItemCommandResult {
        return try {
            itemPort.addItem(t.name,t.count)
            AddItemCommandResult(true,null,null)
        }catch (e: Exception){
            AddItemCommandResult(false,e.message,e.cause)
        }
    }

    override fun getCommandType(): Class<AddItemCommand> {
        return AddItemCommand::class.java
    }
}