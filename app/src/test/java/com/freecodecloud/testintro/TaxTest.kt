package com.freecodecloud.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


/**
 * Created by Sandip Rode
 * on 05-04-2022.
 */
class TaxTest {

    // TDD - Test Driven Development
    lateinit var tax :Tax

    @Before
    fun setUp() {
        tax =Tax()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun calculateTax() {
        val netTax =tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncome() {
        val netIncome =tax.calculateIncome(200.0,0.2)
        assertThat(netIncome).isEqualTo(160)
    }
}