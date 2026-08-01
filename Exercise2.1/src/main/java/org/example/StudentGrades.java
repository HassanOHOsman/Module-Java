package org.example;

public class StudentGrades {
    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public StudentGrades(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    public String[] getFirstNames() {
        return firstNames;
    }

    public String[] getLastNames() {
        return lastNames;
    }

    public int[] getGrades() {
        return grades;
    }
}
