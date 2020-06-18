package com.udojava.evalex;

import org.junit.Test;

import java.math.BigDecimal;

public class TestBadBehaviour {

    @Test
    public void testTrailingOperator() {
        try {
            BigDecimal result = new Expression("2PI+").eval();
            System.out.println(result.toString());
            assert(false);
        } catch (Exception e) {
            assert(true);
        }
    }
}
