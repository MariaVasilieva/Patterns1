package org.example.state;

public class WaitingDrinkState implements State {
    private CoffeeMachine coffeeMachine;
    public WaitingDrinkState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void insertMoney() {
        System.out.println("You have already inserted money.");
    }

    @Override
    public void chooseDrink(String drink) {
        System.out.println("Drink is " + drink);
        coffeeMachine.setSelectedDrink(drink);
        coffeeMachine.setCurrentState(coffeeMachine.dispenseState);
    }

    @Override
    public void dispense() {
        System.out.println("Choose a drink!");
    }
}
