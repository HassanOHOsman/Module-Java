package org.example;

public class StatementService {



    public void generateAndSendOutgoingStatement(){

        Statement statement = new OutgoingTransactionsMonthlyStatement();
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement(statement);

    }

    public void generateAndSendAllTransactionsStatement(){

        Statement statement = new AllTransactionsMonthlyStatement();
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement(statement);
    }
}
