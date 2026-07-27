package org.example;

public class StatementDeliveryService {

    public void deliverStatement(String statementContent, StatementSender statementSender) {
        System.out.println(statementContent + " has been sent using " + statementContent + ".");
    }
}
