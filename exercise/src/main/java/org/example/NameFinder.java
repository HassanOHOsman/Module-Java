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


    public void vowelNamesCapitalisedDescending(List<String> listOfNames) {
        List<String> namesStartsWithVowel = listOfNames.stream()
                .filter(name -> name.toUpperCase().matches("^[AEIOUaeiou].*"))
                .collect(Collectors.toList()).reversed();

        System.out.println(namesStartsWithVowel);
    }



}
