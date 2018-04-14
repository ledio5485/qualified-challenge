package io.qualified.challenge.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.DoubleBinaryOperator;

class OperatorFactory {
    private static final Map<String, DoubleBinaryOperator> operatorsMap = new HashMap<String, DoubleBinaryOperator>() {{
        put("+", new Summation());
        put("-", new Subtraction());
        put("*", new Multiplication());
        put("/", new Division());
    }};

    Set<String> getOperators(){
        return operatorsMap.keySet();
    }

    DoubleBinaryOperator get(String operator) {
        if (!operatorsMap.containsKey(operator)) {
            throw new IllegalArgumentException("Operator not supported.");
        }
        return operatorsMap.get(operator);
    }
}
