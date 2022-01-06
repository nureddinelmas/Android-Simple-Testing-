package com.nureddinelmas.testintro

class Tax {
    // TDD - Test Driven Development
   //  Uygulamalari adim adim test etmektir. Yani development yaptim sonra test yaptim degil.
    // Test- (burada fun yazmadan once testi yaz. ) Development- Test- Development- Test- ...
    // birden fazla assert yapilacaksa ayri ayri assert yap.


    fun calculateTax(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome * taxRate

    }

    fun calculateIncome(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome - (grossIncome * taxRate)
    }
}