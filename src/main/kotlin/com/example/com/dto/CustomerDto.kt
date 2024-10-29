package com.example.com.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CustomerDto {

    @field:NotNull(message = "Fullname is required")
    @field:NotBlank(message = "Name is required")
    var fullName: String? = null

    @field:NotBlank(message = "Email is required")
    @field:NotNull(message = "Email is required")
    var email: String? = null

}
