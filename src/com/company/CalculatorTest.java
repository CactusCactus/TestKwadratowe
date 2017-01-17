package com.company;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jakub on 16.01.2017.
 */
class CalculatorTest {
    @Test
    public void testQuadratic() {
        Calculator calculator = new Calculator();
        assertArrayEquals(new double[]{Double.NaN, Double.NaN}, calculator.countQuadratic(10,5,5));
        assertArrayEquals(new double[]{-1, -1}, calculator.countQuadratic(1,2,1));
        assertArrayEquals(new double[]{Double.NaN, Double.NaN}, calculator.countQuadratic(1,2,3));
        assertArrayEquals(new double[]{-1, -1}, calculator.countQuadratic(2,4,2));

    }

}