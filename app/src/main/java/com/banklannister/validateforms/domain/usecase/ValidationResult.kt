package com.banklannister.validateforms.domain.usecase

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
