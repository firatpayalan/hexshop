package com.firat.hexshop.domain.interaction.additem

import com.firat.hexshop.infrastructure.bus.HexshopCommand

class AddItemCommand(
    val name: String,
    val count: Int,
): HexshopCommand()


