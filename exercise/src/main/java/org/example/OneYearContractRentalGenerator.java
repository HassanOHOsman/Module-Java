package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OneYearContractRentalGenerator implements RentalCalculator {

    List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        double monthlyCapital = contract.getCarPrice() / 12;

        return rentals;

    }
}
