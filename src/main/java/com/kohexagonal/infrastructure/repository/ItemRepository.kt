package com.kohexagonal.infrastructure.repository

import com.kohexagonal.infrastructure.entity.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<Item, Long> {
}