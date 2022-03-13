package com.firat.hexshop.domain.entity

import java.util.*

data class Item(
    val name: String,
    val count: Int
){
    val id: String = UUID.randomUUID().toString()
}
