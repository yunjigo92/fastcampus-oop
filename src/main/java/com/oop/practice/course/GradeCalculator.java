package com.oop.practice.course;

import java.util.List;

public class GradeCalculator {

    // 일급 컬렉션
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        // 학점 수 + 교과목 평점의 합계
        double mulipliedCreditAndCourseGrade = courses.multipliedCreditAndCourseGrade();

        // 수강신청 총 학점 수
        double totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return mulipliedCreditAndCourseGrade/ totalCompletedCredit;
    }
}
