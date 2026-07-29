package org.example;

import java.time.LocalDate;

public interface Statement {
    String getCustomerName();
    String getBankName();
    double getBalance();
    LocalDate getStatementDate();
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

Q4. You’re now starting to build up a hierarchy of classes and interfaces. Have a look back through the reflection
    questions about and apply them to your refactored system - are the answers the same? Are interfaces even more
    important now? Imagine we increased the complexity even further by adding more services and functionality - do
    interfaces become more or less important?
A4. In a summary, interfaces become more improtant as a system complexity increases.


 */