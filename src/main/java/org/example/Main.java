package org.example;


import org.example.state.CoffeeMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.dispense();
        coffeeMachine.insertMoney();
        coffeeMachine.dispense();
        coffeeMachine.chooseDrink("coffee Americano");
        coffeeMachine.dispense();

    }
}