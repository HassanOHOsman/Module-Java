package org.example;

public class StatementDeliveryService {

    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    public static void main(String[] args) {
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();


    }
}
