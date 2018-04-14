package io.qualified.challenge.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummationTest {

    private final Summation summation = new Summation();

    @Test
    public void shouldDoSummation() {
        assertEquals(5.25, summation.applyAsDouble(2.1, 3.15), 0);
    }
}