package org.example;

import java.time.LocalDate;
import java.util.List;

public class RentalSummary {
    private String customerName;
    private String customerAge;
    private LocalDate startDate;
    private LocalDate endDate;
    private  List<Rental> rentals;
    private Rental nextDueRental;
    private double capitalAmount;
    private double interestAmount;
    private int numberOfRemainingRentals;


    public RentalSummary(String customerName, String customerAge, LocalDate startDate, LocalDate endDate, List<Rental> rentals, Rental nextDueRental, double capitalAmount, double interestAmount, int numberOfRemainingRentals) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentals = rentals;
        this.nextDueRental = nextDueRental;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.numberOfRemainingRentals = numberOfRemainingRentals;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public Rental getNextDueRental() {
        return nextDueRental;
    }

    public double getCapitalAmount() {
        return capitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public int getNumberOfRemainingRentals() {
        return numberOfRemainingRentals;
    }


    @Override
    public String toString(){
        return "Customer: " + customerName +
                "\nAge: " + customerAge +
                "\nStart Date: " + startDate +
                "\nEnd Date: " + endDate +
                "\nNext Due Rental: " + nextDueRental +
                "\nTotal Capital: " + capitalAmount +
                "\nTotal Interest: " + interestAmount +
                "\nRemaining Rentals: " + numberOfRemainingRentals;
    }
}
