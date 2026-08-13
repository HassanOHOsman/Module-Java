package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OneYearContractRentalGenerator implements RentalCalculator {

    List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        double monthlyCapital = contract.getCarPrice() / 12;
        double monthlyInterest = monthlyCapital * 0.02;

        for (int i = 1; i <= 12; i ++) {

            Rental rental = new Rental(LocalDate.now(), monthlyCapital, monthlyInterest, false);

            rentals.add(rental);

        }

        return rentals;

    }
}
