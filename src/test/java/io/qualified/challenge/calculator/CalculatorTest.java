package io.qualified.challenge.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calc = new Calculator(new OperatorFactory());

    @Test
    public void shouldSupportNullAndEmptyExpressionsAndShouldReturnsZero() {
        assertEquals(0d, calc.evaluate(null), 0);
        assertEquals(0d, calc.evaluate(""), 0);
    }

    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calc.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloats() {
        assertEquals(3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubtraction() {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDividingByZero(){
        calc.evaluate("4 0 /");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenUnknownOperatorIsEvaluating(){
        calc.evaluate("4 2 %");
    }
}