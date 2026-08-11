package org.example;

public class Remainders {

    public void printRemainders(int divisor) {
        String remainders = "";
        for (int i = 1; i <= 20; i ++) {
            int remainder = i % divisor;
            if (i < 20) {
                remainders += remainder + ",";
            } else {
                remainders += remainder
            }

        }
        remainders += "\n";

        System.out.println(remainders);


    }
}
