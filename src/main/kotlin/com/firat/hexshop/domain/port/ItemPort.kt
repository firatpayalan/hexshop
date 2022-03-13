package com.firat.hexshop.domain.port

import com.firat.hexshop.domain.entity.Item

interface ItemPort {
    fun addItem(name: String, count: Int)
    fun getItem(name: String): Item

}