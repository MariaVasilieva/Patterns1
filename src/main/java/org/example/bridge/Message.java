package org.example.bridge;

public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public abstract void sendMessage(String message);
}
