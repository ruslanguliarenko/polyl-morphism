package com.company;

public class Bookkeeper{

    private ProfessorAccounting professorAccounting;
    private StudentAccounting studentAccounting;

    Bookkeeper(int salRateProf, int salRateStudent){
        professorAccounting = new ProfessorAccounting(salRateProf);
        studentAccounting = new StudentAccounting(salRateStudent);
    }

    public void setSalaryRateProf(int salRate){
       professorAccounting.setSalaryRate(salRate);
    }
    public void setSalaryRateStudent(int salRate){
        studentAccounting.setSalaryRate(salRate);
    }

    public void getSalary(Professor professor){
        professorAccounting.getSalary(professor);
    }
    public void getSalary(Student student){
        studentAccounting.getSalary(student);
    }

}
