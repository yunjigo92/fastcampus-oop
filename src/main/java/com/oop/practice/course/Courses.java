package com.oop.practice.course;

import java.util.List;

public class Courses {
    private final List<Course> courses;
    Courses(List<Course> courses){
        this.courses = courses;
    }


    public double multipliedCreditAndCourseGrade(){
        return courses.stream().mapToDouble(Course::multiplyCreditAndCourceGrade).sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream().mapToInt(Course::getCredit).sum();
    }
}
