package org.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

import static org.example.Contract.ContractLengthYears.One_YEAR;

public class RentalSummaryService {

    private Optional<RentalSummary> generateRentalSummary(Contract contract) {

        RentalCalculator rentalCalculator;

        if (contract.getContractLengthYears() == One_YEAR) {
            rentalCalculator = new OneYearContractRentalGenerator();
        } else {
            rentalCalculator = new ThreeYearContractRentalGenerator();
        }

        List<Rental> rentals = rentalCalculator.generateRentals(contract);

        RentalSummary rentalSummary = new RentalSummary(contract.getCustomerName(), contract.getCustomerAge(), contract.getStartDate(), );

    }



    void printRentalSummary(Contract contract) {

    }
}
