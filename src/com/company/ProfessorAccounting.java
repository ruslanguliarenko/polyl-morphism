package com.company;

public class ProfessorAccounting implements Accounting<Professor, Currency>{

    private int salaryRate;
    private String salary;

    public ProfessorAccounting(int salRate){
        salaryRate = salRate;
    }

    @Override
    public String getSalary(Professor professor) {

        salary = "Salary of " + professor.getName() +  " " +
                salaryRate * professor.getAcademicDegree().getValue()  + " " + getCurrency();

        System.out.println(salary);

        return salary;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }

    public void setSalaryRate(int salaryRate) {
        this.salaryRate = salaryRate;
    }
}
