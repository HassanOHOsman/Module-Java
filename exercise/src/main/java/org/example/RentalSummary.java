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



}
