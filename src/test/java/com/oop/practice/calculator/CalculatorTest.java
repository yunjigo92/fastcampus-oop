package com.oop.practice.calculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
*
* calulator TDD를 위한 test
*
* @author yunji
* @version 1.0.0
* @date 2023/01/13
*/
public class CalculatorTest {

    // 1 + 2 는 3
    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formaulaAndResult")
    void calTest(int num1, String operator, int num2, int result) {
        int val = Calculator.calculate(num1,operator,num2);

        assertThat(result).isEqualTo(val);
    }

    private static Stream<Arguments> formaulaAndResult(){
        return Stream.of(
                Arguments.arguments(1,"+",2,3),
                Arguments.arguments(1,"-",2,-1),
                Arguments.arguments(4,"*",2,8),
                Arguments.arguments(4,"/",2,2)
        );
    }
}
