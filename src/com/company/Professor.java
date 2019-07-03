package com.company;


public class Professor extends Person{

    private AcademicDegree academicDegree;

    public Professor(String name, int age, AcademicDegree academicDegree){
        super(name, age);
        this.academicDegree = academicDegree;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }


}
