package com.udojava.evalex

import java.math.BigDecimal

class UserDefinedFunction(val expression : String) {

    private val e = Expression(expression)

    fun eval(params : Map<String, BigDecimal>) : Double {
        e.usedVariables.forEach {
            assert(params.containsKey(it))
            e.with(it, params[it])
        }

        return e.eval().toDouble()
    }

}