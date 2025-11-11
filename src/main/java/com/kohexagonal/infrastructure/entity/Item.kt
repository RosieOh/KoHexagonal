package com.kohexagonal.infrastructure.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
class Item(
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String,
    var price: BigDecimal,
)