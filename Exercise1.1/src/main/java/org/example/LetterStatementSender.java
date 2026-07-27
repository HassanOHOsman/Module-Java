package org.example;

public class LetterStatementSender implements StatementSender {
    @Override
    public void sendStatement(String statementContent) {
        System.out.println("The statement has been successfully posted to your address.");
    }
}
