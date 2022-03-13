package com.firat.hexshop.domain.repository

import com.firat.hexshop.domain.entity.Item
import com.firat.hexshop.domain.port.ItemPort
import org.springframework.stereotype.Component

@Component
class InMemoryItemRepository: ItemPort {
    private var itemMap = HashMap<String, Item>()

    override fun addItem(name: String, count: Int) {

        val item = Item(name, count)
        itemMap[item.id] = item
    }

    override fun getItem(name: String): Item {
        return itemMap.values.filter {
            name.equals(it.name,ignoreCase = true)
        }.first()
    }
}