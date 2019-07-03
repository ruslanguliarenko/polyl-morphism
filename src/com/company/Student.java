package com.company;

public abstract class Student extends Person {

    protected static int index = 0;
    protected static int amountOfStudent = 0;
    protected Department dept;
    protected double averageScore;
    protected int id;

    protected Student(String name, int age, Department dept, double averageScore){
        super(name, age);
        this.dept = dept;
        this.averageScore = averageScore;
        id = index;
        index++;
        amountOfStudent++;
    }

    public static void getAmountStudent() {
        System.out.println("Amount of student   " + amountOfStudent);
    }

    protected double getAverageScore(){
        System.out.println("Student average score is " + amountOfStudent);
        return averageScore;
    }

}
