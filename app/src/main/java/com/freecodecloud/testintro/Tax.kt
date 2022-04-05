package com.freecodecloud.testintro


/**
 * Created by Sandip Rode
 * on 05-04-2022.
 */
class Tax {


    fun calculateTax(grossIncome: Double, taxRate: Double): Double {
        return grossIncome * taxRate
    }


    fun calculateIncome(grossIncome: Double, taxRate: Double): Double {
        return grossIncome - (grossIncome * taxRate)
    }
}