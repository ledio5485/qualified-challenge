package io.qualified.challenge.calculator;

import java.util.*;

/**
 * The calculator evaluates expressions given to you in string format.
 *
 * The expressions are numbers and operators. Go through the expression left to right, keep track of the numbers,
 * and when you come to an operator, apply it to the previous two numbers, and replace them with the result.
 */
class Calculator {
    private final OperatorFactory operatorFactory;

    Calculator(OperatorFactory operatorFactory) {
        this.operatorFactory = operatorFactory;
    }

    double evaluate(String expr) {
        if (expr == null || expr.isEmpty()) {
            return 0;
        }

        Stack<Double> bucket = new Stack<>();
        Arrays.stream(expr.split(" ")).forEach(input -> {
            if (operatorFactory.getOperators().contains(input)) {
                Double operand2 = bucket.pop();
                Double operand1 = bucket.pop();
                Double result = operatorFactory.get(input).applyAsDouble(operand1, operand2);
                bucket.push(result);
            } else {
                bucket.push(Double.parseDouble(input));
            }
        });
        return bucket.pop();
    }
}
