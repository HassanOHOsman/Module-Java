package org.example;


import java.util.List;
import java.util.stream.Collectors;

public class NameFinder {

    public void printNamesStartingWithA(List<String> listOfNames) {
        List<String> namesStartsWithA = listOfNames.stream()
                .filter(name -> name.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(namesStartsWithA);

    }



}
