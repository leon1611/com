package com.example.com.controller

import com.example.com.dto.CustomerDto
import com.example.com.entity.Customer
import com.example.com.service.CustomerService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customers")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping()
    fun getCustomers() = customerService.getCustomer()

    @PostMapping()
    fun save (@RequestBody @Valid customerDto: CustomerDto):Customer{
      return customerService.save(customerDto)
    }


    /* Response*/

    /*@GetMapping
    fun getCustomers(): SuccessResponse {
        val customers = customerService.getCustomer()
        return SuccessResponse().apply {
            status = "success"
            data = customers
        }
    }

    @GetMapping("/failed")
    fun failedResponse(): FailedResponse {
        return FailedResponse().apply {
            status = "La operación ha fallado"
            data = listOf("Error de validación", "El cliente no fue encontrado")
        }
    }

    @GetMapping("/error")
    fun errorModel(): ErrorResponse {
        return ErrorResponse().apply {
            status = "error"
            data = "Ocurrió un error en la solicitud"
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid customerDto: CustomerDto): SuccessResponse {
        val savedCustomer = customerService.save(customerDto)
        return SuccessResponse().apply {
            status = "success"
            data = savedCustomer
        }
    }*/
}