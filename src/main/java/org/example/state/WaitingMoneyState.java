package org.example.state;

public class WaitingMoneyState implements State {
    private CoffeeMachine coffeeMachine;
    public WaitingMoneyState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted.");
        coffeeMachine.setCurrentState(coffeeMachine.waitingDrinkState);
    }

    @Override
    public void chooseDrink(String drink) {
        System.out.println("You should insert money!");
    }

    @Override
    public void dispense() {
        System.out.println("You should insert money!");
    }
}
