package org.example;

/**
 * Defines a contract for sending monthly statements to customers.
 * Contains an abstract method {@code sendStatement} which will be implemented differently by two extending
 * interfaces.
 *
 * @author  Hassan Osman
 * @version 1.0
 * @since 1.0
 */
public interface StatementSender {
    /**
     * Sends monthly statements to customers.
     *
     * @param statementContent the content of the statement to be sent
     */
    String sendStatement(String statementContent);
}

/*
Questions and Answers:
Q1. What should the return type of this method be?
A1. String

Q2. What is the visibility of interface methods? Why?
A2. public so that they are easily accessible by all implementing classes.

Q3. Why is this Javadoc important? Think about who we are aiming this javadoc at
(i.e. who will read it / benefit from it)?
A3. Besides providing description, it let other developers understand the puporse behind the interface
    and its abstract method.
*/
