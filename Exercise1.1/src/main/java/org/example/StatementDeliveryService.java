package org.example;

public class StatementDeliveryService {

    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    public static void main(String[] args) {
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();

        EmailStatementSender emailStatementSender = new EmailStatementSender();
        LetterStatementSender letterStatementSender = new LetterStatementSender();

        statementDeliveryService.deliverStatement("March 2026", emailStatementSender);
        statementDeliveryService.deliverStatement("July 2026", letterStatementSender);


    }
}
