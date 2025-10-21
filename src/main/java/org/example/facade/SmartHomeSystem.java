package org.example.facade;

public class SmartHomeSystem {
    private Light light;
    private AirCondition airCondition;
    public SmartHomeSystem() {
        light = new Light();
        airCondition = new AirCondition();
    }

    public void arriveHome(){
        light.on();
        airCondition.on();
    }
    public void leaveHome(){
        light.off();
        airCondition.off();
    }
}
