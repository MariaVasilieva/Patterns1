package org.example.abstractFactory;

public class WindowsTextField implements TextField {
    @Override
    public void show() {
        System.out.println("Windows TextField");
    }
}
