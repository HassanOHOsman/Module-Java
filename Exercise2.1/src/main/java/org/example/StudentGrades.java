package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public Set<String> getDistinctFirstNames(String[] firstNames) {
        return Set.of(firstNames);
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(String[] firstNames) {
        Set<String> set = new TreeSet<>();
        set.addAll(Arrays.asList(firstNames));
        return set;


    }
}
