package com.heatonresearch.aifh.error;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: jheaton
 * Date: 7/27/13
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestErrorCalculationMSE {

    @Test
    public void testErrorCalc() {
        ErrorCalculation calc = new ErrorCalculationMSE();
        double result = ErrorTestingUtil.calculateError(
                calc,
                ErrorTestingUtil.ACTUAL,
                ErrorTestingUtil.IDEAL);
        assertEquals(151.6205, result, 0.001);
    }
}
