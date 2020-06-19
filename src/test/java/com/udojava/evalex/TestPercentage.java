package com.udojava.evalex;

import org.junit.Test;

public class TestPercentage {

    @Test
    public void testBasicPercentage() {
        assert(new Expression("100-10%").eval().intValue() == 90);
        assert(new Expression("200+10%").eval().intValue() == 220);
        assert(new Expression("-10%").eval().doubleValue() == -0.1);
        assert(new Expression("120%").eval().doubleValue() == 1.2);
        assert(new Expression("120%+(10+5)").eval().doubleValue() == 16.2);
        assert(new Expression("120%+0.8").eval().doubleValue() == 2);
        assert(new Expression("4*120%").eval().doubleValue() == 4.8);
        assert(new Expression("120%*4").eval().doubleValue() == 4.8);
        assert(new Expression("(4*120%)").eval().doubleValue() == 4.8);
        assert(new Expression("(100+10%)*4").eval().intValue() == 440);
    }

}
