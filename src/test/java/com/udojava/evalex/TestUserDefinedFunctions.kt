package com.udojava.evalex;

import org.junit.Test;
import java.math.BigDecimal
import kotlin.math.sin

public class TestUserDefinedFunctions {

    @Test
    fun testSimpleFunction() {
        val f = UserDefinedFunction("x+2+y")
        val result = f.eval(mapOf("x" to BigDecimal(4), "y" to BigDecimal(6)))
        assert(result == 12.0)
    }

    @Test
    fun testSeveralCalls() {
        val f = UserDefinedFunction("x^2+5")

        for (i in 0 until 100) {
            assert(f.eval(mapOf("x" to BigDecimal(i))) == (i*i+5).toDouble())
        }
    }

    @Test
    fun testTrigonometricalFunctions() {
        val f = UserDefinedFunction("sinr(x)")

        for (i in 90 until 91) {
            assert(f.eval(mapOf("x" to BigDecimal(i))).also { println(it) } == sin(i.toDouble()).also { println(it) })
        }
    }

}
