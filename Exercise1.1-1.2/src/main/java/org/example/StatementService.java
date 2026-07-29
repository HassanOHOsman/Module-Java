package org.example;

import java.time.LocalDate;

public class StatementService {



    public void generateAndSendOutgoingStatement(StatementSender statementSender){
        Statement statement = new OutgoingTransactionsMonthlyStatement("Hassan Osman", "Monzo", 650.95, LocalDate.now());
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement(statement, statementSender);
    }


    public void generateAndSendAllTransactionsStatement(StatementSender statementSender){
        Statement statement = new AllTransactionsMonthlyStatement("Mishaal AL-Saud", "Coutts", 97309.05, LocalDate.of(2026, 03, 31));
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement(statement, statementSender);
    }
}
