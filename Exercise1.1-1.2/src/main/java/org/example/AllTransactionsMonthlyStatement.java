package org.example;

public class AllTransactionsMonthlyStatement implements Statement{

    @Override
    public void getCustomer(String customerName) {
        System.out.println("Customer Name is " + customerName);
    }

    @Override
    public void getBank(String bankName) {
        System.out.println("You bank with " + bankName);
    }

    @Override
    public void getBalance(String monthName, double balance) {
        System.out.println("For the month of " + monthName + ", the net balance is " + balance + ".");
    }
}
