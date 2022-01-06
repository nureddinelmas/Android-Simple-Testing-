package com.nureddinelmas.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax : Tax
    @Before
    fun setup(){
        // buraya initialization kismini yaziyororuz. Yani test baslamadan once neler yapilmalidir.
        tax = Tax()
    }

    @After
    fun tearDown(){
        // Buraya da test islemleri bittikten sonra neler yapilmalidir bunlari yaziyoruz.
    }

    @Test
    fun calculateTest(){
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest(){
        val netTax = tax.calculateIncome(100.0, 0.1)
        assertThat(netTax).isEqualTo(90)

    }
}