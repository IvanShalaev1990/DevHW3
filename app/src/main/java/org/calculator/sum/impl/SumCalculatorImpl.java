package org.calculator.sum.impl;

import org.calculator.sum.SumCalculator;

public class SumCalculatorImpl implements SumCalculator {
    @Override
    public int sum(int num) {
        if(num == 0){
            throw new IllegalArgumentException();
        }
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }
}
