package org.example;

public class StatementService {



    public void generateAndSendOutgoingStatement(){

        Statement statement = new OutgoingTransactionsMonthlyStatement();
        StatementSender statementSender = new StatementSender();
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement(statement, statementSender);

    }

    public void generateAndSendAllTransactionsStatement(){

        Statement statement = new AllTransactionsMonthlyStatement();
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement(statement, statementSender);
    }
}
