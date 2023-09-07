package com.banklannister.validateforms.domain.usecase



class ValidatePassword {

    fun execute(password: String): ValidationResult {
        if (password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "The Password needs to consist of at least 8 characters"
            )
        }
        val containLettersAndDigits = password.any { it.isDigit() }
                && password.any{ it.isLetter()}
        if (!containLettersAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to contain contain letters and digits"
            )
        }

        return ValidationResult(
            successful = true
        )

    }

}