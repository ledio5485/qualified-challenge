package io.qualified.challenge.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {

    private final Subtraction subtraction = new Subtraction();

    @Test
    public void shouldDoSubtraction() {
        assertEquals(4.1, subtraction.applyAsDouble(9.2, 5.1), 0);
    }
}