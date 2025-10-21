package org.example.proxy;

public class RealConnection implements Connection {

    @Override
    public void connect(String host) {
        System.out.println("Connecting to " + host);
    }
}
