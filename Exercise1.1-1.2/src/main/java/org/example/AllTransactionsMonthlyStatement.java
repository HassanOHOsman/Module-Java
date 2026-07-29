package org.example;

import java.time.LocalDate;

public class AllTransactionsMonthlyStatement implements Statement{

    private String customerName;
    private String bankName;
    private double balance;
    private LocalDate statementDate;

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public LocalDate getStatementDate() {
        return statementDate;
    }

    public AllTransactionsMonthlyStatement(String customerName, String bankName, double balance, LocalDate statementDate) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.balance = balance;
        this.statementDate = statementDate;
    }

}
