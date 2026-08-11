package org.example;


import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

    public void printNamesStartingWithA(List<String> listOfNames) {
        listOfNames.stream()
                .filter(name -> name.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(listOfNames);




    }



}
