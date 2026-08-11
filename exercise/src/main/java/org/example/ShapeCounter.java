package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShapeCounter {

    public int countShapesWithSides(Map<String, Integer> shapesToSides, int numberOfSides) {

        int numOfShapesWithThatNumOfSides = (int) shapesToSides.values().stream()
                .filter(value -> value == numberOfSides)
                .count();


        return numOfShapesWithThatNumOfSides;

    }
}
