package org.example;

public interface EmailStatementSender extends StatementSender{

    @Override
    public void sendStatement() {
        System.out.println("The statement has been successfully emailed to you.");
    }
}
