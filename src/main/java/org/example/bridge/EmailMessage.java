package org.example.bridge;

public class EmailMessage extends Message {
    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String message) {
        messageSender.send(message);
    }
}
