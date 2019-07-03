package com.company;

public class ContractStudent extends Student {

    public static  int amountOfContractStudent = 0;
    private int balance = 0;

    public ContractStudent(String name, int age, Department dept, double averageScore) {
        super(name, age, dept, averageScore);
        amountOfContractStudent++;
    }
    public boolean isPaidForUniversity(){
        if(balance < 0 )
            return false;
        else
            return true;
    }

    public void withdraw(int money){
        balance -= money;
    }

    public void recharge(int money){
        balance += money;
    }

    public double getAverageScore() {
        System.out.println("Contract student " + getName()+" ID " + id + " average score " + averageScore*0.9);
        return averageScore;
    }

    public static void getAmountStudent(){
        System.out.println("Amount of contract student   " + amountOfContractStudent);
    }

}
