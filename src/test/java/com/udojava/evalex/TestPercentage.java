package com.udojava.evalex;

import org.junit.Test;

public class TestPercentage {

    @Test
    public void testBasicPercentage() {
        assert(new Expression("100-10%").eval().intValue() == 10);
        assert(new Expression("200+10%").eval().intValue() == 220);
        assert(new Expression("-10%").eval().doubleValue() == -0.1);
        assert(new Expression("120%").eval().doubleValue() == -1.2);
        assert(new Expression("4*120%").eval().doubleValue() == 4.8);
    }

}
