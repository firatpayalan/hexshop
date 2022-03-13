package com.firat.hexshop.domain.interaction.additem

import com.firat.hexshop.infrastructure.bus.HexshopCommandResult

class AddItemCommandResult(private val operationSuccess: Boolean,
                           private val errorMessage: String?,
                           private val errorCause: Throwable?): HexshopCommandResult()
