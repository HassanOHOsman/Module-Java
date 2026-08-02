package org.example;

import java.util.*;

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
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(firstNames));
        return set;
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(String[] firstNames) {
        Set<String> set = new TreeSet<>();
        set.addAll(Arrays.asList(firstNames));
        return set;


    }

    public Map<String, Integer> getLastNameToGrade(String[] lastNames, int[] grades) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            map.put(lastNames[i], grades[i]);
        }
        return map;
    }
}
