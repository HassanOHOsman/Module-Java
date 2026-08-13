package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OneYearContractRentalGenerator implements RentalCalculator {

    List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        double monthlyCapital = contract.getCarPrice() / 12;
        double monthlyInterest = monthlyCapital * 0.02;

        Rental rental = new Rental(LocalDate.of(2027, 9, 1), 66000.95, 1320.02, false);

        return rentals;

    }
}
