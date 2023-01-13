package com.oop.practice.calculator;

import java.util.Arrays;

/**
 * 계산기를 좀 더 객체 지향적으로 구현할 수 없으까?
 *
 * @author : yunji
 * @version : 1.0.0
 * @date : 2023/01/13
 */
public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int arithmeticCalculate(int num1, int num2) {
            return num1 + num2;
        }
    }, SUBTRACTION("-"){
        @Override
        public int arithmeticCalculate(int num1, int num2) {
            return num1 - num2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithmeticCalculate(int num1, int num2) {
            return num1 * num2;
        }
    }, DIVISION("/") {
        @Override
        public int arithmeticCalculate(int num1, int num2) {
            return num1 / num2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator){
        this.operator = operator;
    }

    public abstract int arithmeticCalculate(final int num1, final int num2);

    public static int calculate(int num1, String operator, int num2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());

        return arithmeticOperator.arithmeticCalculate(num1, num2);
    }
}
