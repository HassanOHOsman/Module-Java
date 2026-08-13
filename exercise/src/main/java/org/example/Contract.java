package org.example;

import java.time.LocalDate;

public class Contract {
    private String customerName;
    private String customerAge;
    private LocalDate startDate;
    private double carPrice;

    enum ContractLengthYears {
        One_YEAR,
        THREE_YEARS
    }

    private ContractLengthYears contractLengthYears;
}
