package com.example.com.mapper

import com.example.com.dto.CustomerDto
import com.example.com.entity.Customer

object CustomerMapper {

    fun toEntity(customerDto: CustomerDto):Customer {
        val customer = Customer()
        customer.fullName = customerDto.fullName
        customer.email = customerDto.email
        return customer
    }



    /*JSedn*/
    /*fun toEntity(customerDto: CustomerDto): Customer {
        return Customer().apply {
            fullName = customerDto.fullName
            email = customerDto.email
        }
    }*/
}