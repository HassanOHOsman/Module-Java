package org.example;

public class EmailStatementSender implements StatementSender{

    @Override
    public void sendStatement(String statementContent) {
        System.out.println("The statement has been successfully emailed to you.");
    }
}
