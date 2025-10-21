package org.example.mediator;

public class Colleague {
    private Mediator mediator;
    private String name;
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public void send(String message){
        System.out.println(name + ": " + message);
        mediator.sendMessage(message,this);
    }
    public void receive(String message){
        System.out.println(name + ": " + message+" received");
    }
}
