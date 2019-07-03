package com.company;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students;

        University vntu = new University("VNTU");

        Department fitce = new Department("FITCE");

        Student stateStudent = new StateStudent("Vasya", 20,   fitce, 4.6);
        Student stateStudent2 = new StateStudent("Petya", 19, fitce, 3.5);
        Student contractStudent = new ContractStudent("Misha", 20, fitce, 4.1);
        Student contractStudent2 = new ContractStudent("Julia", 20, fitce, 4.8);

        students = new ArrayList<>(Arrays.asList(stateStudent, stateStudent2, contractStudent, contractStudent2));


        vntu.addDepartment(fitce);

        fitce.addStudent(students);

        students = fitce.expulsion(stateStudent);

        stateStudent2.getAverageScore();
        contractStudent.getAverageScore();

        Student newStudent = new StateStudent("Vova", 19, fitce, 4.1);
        fitce.addStudent(newStudent);

        stateStudent2.getAmountStudent();
        StateStudent.getAmountStudent();

        Professor professor = new Professor("Volodymyr", 41, AcademicDegree.Assistant);

        Bookkeeper bookkeeper = new Bookkeeper(600, 200);
        bookkeeper.getSalary(professor);
        bookkeeper.getSalary(newStudent);

        vntu.universityInfo();

        for(Student fitceStudent : fitce.getStudents()){
            fitceStudent.getAverageScore();
        }

    }
}
