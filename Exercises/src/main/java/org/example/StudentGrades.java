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


    public Map<Student, Integer> getStudentToGrade() {
        Map<Student, Integer> map = new HashMap<>();

        for (int i = 0; i < firstNames.length; i ++) {
            Student student = new Student(firstNames[i], lastNames[i]);
            map.put(student, grades[i]);
        }
        return map;
    }

}

/*
Reflection

Suppose there are a set of twins in the class, so there are some duplicate lastNames. Can we still build a map of
students to their grades?

Answer: perhaps we might need a 4th array that provide unique values that could be associated with each student.
Something like an array of student's ID numbers can work. Otherwise, maybe there's a way for the key to be customized
to include both the first and last names of each student in such cases.
 */
