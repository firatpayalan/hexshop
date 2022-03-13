package com.firat.hexshop.domain.entity

import java.util.*

data class Cart(
    val id: String,
    val items: List<Item>,
    val date: Date
)

