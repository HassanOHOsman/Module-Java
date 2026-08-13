package org.example;

import java.time.LocalDate;

public class Rental {
    private LocalDate dueDate;
    private double capitalAmount;
    private double interestAmount;
    private boolean paid;


    public Rental(LocalDate dueDate, double capitalAmount, double interestAmount, boolean paid) {
        this.dueDate = dueDate;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.paid = paid;
    }
}
