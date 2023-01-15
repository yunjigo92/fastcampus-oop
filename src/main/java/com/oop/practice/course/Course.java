package com.oop.practice.course;

public class Course {

    //과목
    private final String subject;
    //학점
    private final int credit;
    //등급
    private final String grade;
    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade =0;
        switch (this.grade){
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade= 4.0;
                break;
            case "B+":
                grade= 3.5;
                break;
            case "B":
                grade= 3.0;
                break;
            case "C+":
                grade= 2.5;
                break;
            case "C":
                grade= 2.0;
                break;
        }
        return grade;
    }

    public double multiplyCreditAndCourceGrade() {
        return this.credit * getGradeToNumber();
    }
}
