package com.company;

public enum AcademicDegree {
    Postgraduate(1), Assistant(2), Full_Professor(3);

    private int value;

    AcademicDegree(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
