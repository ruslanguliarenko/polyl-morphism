package com.company;

public interface Accounting<T extends Person, S extends Currency> {

    String getSalary(T person);

    S getCurrency();
}