package com.portfolio.bookstore

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest {


    @Test
    fun shouldValidateName() {
        val validator = Validator()
        Assert.assertTrue(validator.isNameValid())
    }

}