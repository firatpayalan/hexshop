package com.firat.hexshop.application

import com.firat.hexshop.application.request.AddItemRequest
import com.firat.hexshop.application.response.AddItemResponse
import com.firat.hexshop.domain.interaction.additem.AddItemCommand
import com.firat.hexshop.domain.interaction.additem.AddItemCommandResponse
import com.firat.hexshop.domain.port.CommandBusExecutor
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/v1/item-context")
class ItemController(private val commandBusExecutor: CommandBusExecutor) {

    @PostMapping("/item")
    fun addItem(addItemRequest: AddItemRequest): AddItemResponse {
        val addItemCommand = AddItemCommand(addItemRequest.name, addItemRequest.count)
        val executed = commandBusExecutor.execute<AddItemCommand, AddItemCommandResponse>(addItemCommand)

        return AddItemResponse(executed.name)
    }

}




