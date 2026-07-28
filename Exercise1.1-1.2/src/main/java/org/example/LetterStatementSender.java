package org.example;

public class LetterStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {
        System.out.println(statementContent + " statement has been successfully posted to your address.");
    }

    @Override
    public void sendStatement(Statement statement) {
        System.out.println("The statement has been successfully posted to your address.");
    }
}
