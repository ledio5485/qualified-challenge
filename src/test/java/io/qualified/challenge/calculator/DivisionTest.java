package io.qualified.challenge.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    private final Division division = new Division();

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDividingByZero() {
        division.applyAsDouble(4, 0);
    }

    @Test
    public void shouldDoDivision() {
        assertEquals(2.5, division.applyAsDouble(5, 2),0);
    }
}