package com.company;

public class StudentAccounting implements Accounting<Student, Currency> {

    private int salaryRate;
    private String salary;

    public StudentAccounting(int salRate){
        salaryRate = salRate;
    }

    public String getSalary(Student student) {

        salary = "Salary of " + student.getName() + " " +
                  salaryRate + " "  + getCurrency(student);

        System.out.println(salary);

        return salary;
    }

    public Currency getCurrency(Student student) {
        return Currency.UAH;
    }

    public void setSalaryRate(int salaryRate) {
        this.salaryRate = salaryRate;
    }

}
