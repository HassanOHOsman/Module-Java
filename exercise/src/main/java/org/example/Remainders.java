package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Remainders {

    public void printRemainders(int divisor) {
        String remainders = "";
        for (int i = 1; i <= 20; i ++) {
            int remainder = i % divisor;
            if (i < 20) {
                remainders += remainder + ",";
            } else {
                remainders += remainder;
            }
        }
        remainders += "\n";

        System.out.println(remainders);
    }



    public Map<Integer, List<Integer>> remainderGroups(int divisor) {

        Map<Integer, List<Integer>> result = IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(number -> number % divisor));

        return result;

    }
}
