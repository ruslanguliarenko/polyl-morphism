package com.company;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Department> departments = new ArrayList<>();


    public University(String name){
        this.name = name;
    }

    public void addDepartment(Department department){
        System.out.println(name + " add department " + department.getName());
        departments.add(department);
    }

    public void universityInfo() {
        System.out.println(name + " amount department " + departments.size());
    }
}
