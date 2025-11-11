package org.example;


import org.example.abstractFactory.*;
import org.example.factoryMethod.CreateCardProcessor;
import org.example.factoryMethod.PaymentProcessor;
import org.example.prototype.Address;
import org.example.prototype.Person;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GUIFactory guiFactory = new MacFactory();
        Button button = guiFactory.createButton();
        TextField field = guiFactory.createTextField();
        button.paint();
        field.show();

        GUIFactory guiFactory2 = new WindowsFactory();
        Button button2 = guiFactory2.createButton();
        TextField field2 = guiFactory2.createTextField();
        button2.paint();
        field2.show();
    }
}
