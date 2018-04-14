package io.qualified.challenge.calculator;

import java.util.function.DoubleBinaryOperator;

class Division implements DoubleBinaryOperator {

    @Override
    public double applyAsDouble(double arg1, double arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("calc.Division by 0 is not possible");
        }
        return arg1 / arg2;
    }
}
