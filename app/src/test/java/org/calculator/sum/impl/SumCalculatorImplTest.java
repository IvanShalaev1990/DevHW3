package org.calculator.sum.impl;

import org.calculator.sum.SumCalculator;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.Acceleration;
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
    @DisplayName("Sum should return sum of all prime number from given number when number is passed")
    void sumShouldReturnSumOfAllPrimeNumberFromGivenNumberWhenNumberIsPassed() {
        int[] testCase = {1,2,3};
        Assertions.assertAll(
                ()-> assertEquals(1,sumCalculator.sum(testCase[0])),
                ()-> assertEquals(3,sumCalculator.sum(testCase[1])),
                ()-> assertEquals(6,sumCalculator.sum(testCase[2]))
        );
    }

    @Test
    @Order(2)
    @DisplayName("Sum should throw IllegalArgumentException when zero is passed")
    void sumShouldThrowIllegalArgumentExceptionWhenZeroIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}