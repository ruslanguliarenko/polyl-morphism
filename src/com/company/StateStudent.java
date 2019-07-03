package com.company;

import java.util.List;

public class StateStudent extends Student{

    public static  int amountOfStateStudent = 0;

    public StateStudent(String name, int age, Department dept, double averageScore) {
        super(name, age, dept, averageScore);
        amountOfStateStudent++;
    }
    private boolean isBursary(){
         if(averageScore >= 4){
            return true;
        }else {
             return false;
         }
    }

    public double getAverageScore() {
        System.out.println("State student " + getName() +" ID " + id + " average score " + averageScore*0.9);
        return averageScore*0.9;
    }

    public static void getAmountStudent(){
        System.out.println("Amount of state student   " + amountOfStateStudent);
    }


}
