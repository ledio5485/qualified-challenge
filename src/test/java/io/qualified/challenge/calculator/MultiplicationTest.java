package io.qualified.challenge.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    private final Multiplication multiplication = new Multiplication();

    @Test
    public void shouldDoMultiplication() {
        assertEquals(7, multiplication.applyAsDouble(2, 3.5), 0);
    }
}