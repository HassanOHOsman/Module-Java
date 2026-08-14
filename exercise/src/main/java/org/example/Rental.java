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

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getCapitalAmount() {
        return capitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public String toString() {
        return "Due Date: " + dueDate +
                ", Capital Amount: " + capitalAmount +
                ", Interest Amount: " + interestAmount +
                ", Paid: " + paid;
    }
}
