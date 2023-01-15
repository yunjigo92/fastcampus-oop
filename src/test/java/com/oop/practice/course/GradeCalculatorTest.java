package com.oop.practice.course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 *  요구사항
 *  평균학점 계산 방법 ( 학점수 + 교과목 평점)의 합계 / 수강신청 총 학점 수
 *
 */
public class GradeCalculatorTest {
    // 학점 계산기 도메인: 이수한 과목, 학점 계산기
    // 도메인 간의 관계를 고민
    // 이수한 과목 : 자료구조, 중국어회화, 수학 등등 --> 과목 클래스로 추상화
    // 각 클래스에 적절한 책임을 위임한다.


    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculaterGradeTest() {
        List<Course> courese = List.of( new Course("oop", 3,"A+"),
                    new Course("자료구조",3,"A+")
                );

        GradeCalculator gradeCalculator = new GradeCalculator(courese);
        double result = gradeCalculator.calculateGrade();

        assertThat(result).isEqualTo(4.5);
    }
}
