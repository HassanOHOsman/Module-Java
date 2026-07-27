package org.example;

public class EmailStatementSender implements StatementSender{

    @Override
    public void sendStatement(String statementContent) {
        System.out.println(statementContent + " statement has been successfully emailed to you.");
    }
}
