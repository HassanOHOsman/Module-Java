package org.example;

public interface StatementSender {

    String sendStatement(String statementContent);
}

/*
Questions and Answers:
Q1. What should the return type of this method be?
A1. String

Q2. What is the visibility of interface methods? Why?
A2. public so that they are easily accessible by all implementing classes.
*/
