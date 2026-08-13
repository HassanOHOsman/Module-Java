package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ThreeYearContractRentalGenerator implements RentalCalculator{

    public List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        for (int i = 1; i <= 36; i ++) {

            double monthlyCapital = contract.getCarPrice() / 36;
            double monthlyInterest = monthlyCapital * 0.03;

            Rental rental =  new Rental(LocalDate dueDate, monthlyCapital, monthlyInterest, boolean paid);

        }

        ;

        return rentals;
    }
}
