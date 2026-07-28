package org.example;

public interface Statement {
    void getCustomer(String customerName);
    void getBank(String bankName);
    void getBalance(String monthName, double balance);
}



/*
Questions and Answers - exercise 1.2:

Q1. What is it called when you have two versions of the same method?
A1. Method Overloading - which is a form of Polymorphism.

Q2. What methods might Statement have? Think about the type of information you’d expect to see on a bank statement.
A2. getCustomer() method - to get the name of a customer, getBalance() method - to get the balance in the statement,
    getBank() method - to get the name of the bank and many more.

Q3. How should the implementation behaviour differ?
A3. Once abstracted methods inherited from the interface, each class should override and implement each abstract
    method differently depending on the class role and responsibility.


 */