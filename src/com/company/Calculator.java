package com.company;

/**
 * Created by jakub on 16.01.2017.
 */
public class Calculator {

    public double[] countQuadratic(int a, int b, int c) {
        double[] zeroPoints = new double[2];
        double deltaSqrt = Math.sqrt(b * b - 4 * a * c);
        zeroPoints[0] = (-b - deltaSqrt) / (2 * a);
        zeroPoints[1] = (-b + deltaSqrt) / (2 * a);
        return zeroPoints;
    }
}
