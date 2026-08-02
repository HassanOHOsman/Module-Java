package org.example;


import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn", "Ali", "Sam"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones", "Hassan", "Clarke"};
        int[] grades = {22, 45, 35, 22, 41, 48, 39};

        StudentGrades studentGrades = new StudentGrades(firstNames, lastNames, grades);

        System.out.println(Arrays.toString(studentGrades.getFirstNames()));
        System.out.println(studentGrades.getDistinctFirstNames(firstNames));
        System.out.println(studentGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames));
        System.out.println(studentGrades.getLastNameToGrade(lastNames, grades));

        System.out.println(studentGrades.getStudentToGrade());


        List<String> firstNamesList = Arrays.asList(studentGrades.getFirstNames());
        Set<String> distinctFirstNamesSet = studentGrades.getDistinctFirstNames(firstNames);
        Set<String> distinctFirstNamesInAlphabeticalOrderSet = studentGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames);
        Map<String, Integer> lastNamesToGradesMap = studentGrades.getLastNameToGrade(lastNames, grades);
        Map<Student, Integer> studentToGradeMap = studentGrades.getStudentToGrade();






    }

}


