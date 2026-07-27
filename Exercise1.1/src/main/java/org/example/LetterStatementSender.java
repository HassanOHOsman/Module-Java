package org.example;

public interface LetterStatementSender extends StatementSender {
    @Override
    public void sendStatement() {
        System.out.println("The statement has been successfully posted to your address.");
    }
}
