package org.example.bridge;

public class TextMessageSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("TextMessageSender sending message: " + message);
    }
}
