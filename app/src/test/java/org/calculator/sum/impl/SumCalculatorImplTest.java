package org.calculator.sum.impl;

import org.calculator.sum.SumCalculator;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SumCalculatorImplTest {
    SumCalculator sumCalculator;
    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculatorImpl();
    }

    @Test
    @Order(1)
    @DisplayName("Sum should return sum of all prime number from given number when not null is passed")
    void sumShouldReturnSumAllPrimeNumberFromGivenNumberWhenNotNullIsPassed() {
        Map<Integer, Integer> testCase = new LinkedHashMap<>();
        testCase.put(1,1);
        testCase.put(2,3);
        testCase.put(3,6);
        testCase.forEach((given, expected)->
                Assertions.assertEquals(sumCalculator.sum(given), expected, String.format("Expected - %d, given - %d", expected, given)));
    }
}