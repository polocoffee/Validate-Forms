package com.banklannister.validateforms.domain.usecase




class ValidateRepeatPassword {

    fun execute(password: String, repeatedPassword: String): ValidationResult {
        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "The Password don't match"
            )
        }


        return ValidationResult(
            successful = true
        )

    }

}