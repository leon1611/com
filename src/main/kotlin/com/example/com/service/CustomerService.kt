package com.example.com.service

import com.example.com.dto.CustomerDto
import com.example.com.entity.Customer
import com.example.com.mapper.CustomerMapper
import com.example.com.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun getCustomer(): List<Customer>{
        return customerRepository.findAll()
    }

    fun save(customerDto: CustomerDto): Customer {
        val customer = CustomerMapper.toEntity(customerDto)
        return customerRepository.save(customer)
    }
}