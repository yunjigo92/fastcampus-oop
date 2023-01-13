package com.oop.practice.calculator;


/**
 * 계산기
 *
 * @author : yunji
 * @version : 1.0.0
 * @date : 2023/01/13
 */
public class Calculator {

    public static int calculate(int num1, String operator, int num2) {
        return ArithmeticOperator.calculate(num1, operator, num2);
    }
}
