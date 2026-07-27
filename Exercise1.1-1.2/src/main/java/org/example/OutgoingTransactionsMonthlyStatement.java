package org.example;

public class OutgoingTransactionsMonthlyStatement implements Statement{

    @Override
    public void getCustomer(String customerName) {
        System.out.println("Customer's Name: " + customerName);
    }

    @Override
    public void getBank(String bankName) {
        System.out.println("Customer's Bank: " + bankName);
    }

    @Override
    public void getBalance(String monthName, double balance) {
        System.out.println("For the month of " + monthName + ", the outgoing balance is " + balance + ".");
    }
}
