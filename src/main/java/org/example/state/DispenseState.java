package org.example.state;

public class DispenseState implements State {
    private CoffeeMachine coffeeMachine;
    public DispenseState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void insertMoney() {
        System.out.println("You have already inserted money.");
    }

    @Override
    public void chooseDrink(String drink) {
        //System.out.println("You have already inserted a drink.");
        System.out.println("Choose a drink:"+drink);
        coffeeMachine.setSelectedDrink(drink);
    }

    @Override
    public void dispense() {
        System.out.println("You have been dispensed.");
        coffeeMachine.setCurrentState(coffeeMachine.waitingMoneyState);
    }
}
