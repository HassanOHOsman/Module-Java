package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String[] firstNames;
    private String[] lastNames;

    public Student(String[] firstName, String[] lastName) {
        this.firstNames = firstName;
        this.lastNames = lastName;
    }

    public String[] getFirstNames() {
        return firstNames;
    }

    public String[] getLastNames() {
        return lastNames;
    }



}
