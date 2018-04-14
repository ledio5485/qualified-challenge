package io.qualified.challenge.calculator;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class OperatorFactoryTest {

    private final OperatorFactory factory = new OperatorFactory();

    @Test
    public void shouldGetOperators() {
        Set<String> expected = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

        Set<String> actual = factory.getOperators();

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenOperatorIsNotFound() {
        factory.get("%");
    }

    @Test
    public void shouldGetTheRightOperator() {
        assertTrue(factory.get("+") instanceof Summation);
        assertTrue(factory.get("-") instanceof Subtraction);
        assertTrue(factory.get("*") instanceof Multiplication);
        assertTrue(factory.get("/") instanceof Division);
    }
}