package org.example.state;

public class CoffeeMachine {
    private String selectedDrink;
    private State currentState;

    public final State waitingMoneyState = new WaitingMoneyState(this);
    public final State waitingDrinkState = new WaitingDrinkState(this);
    public final State dispenseState = new DispenseState(this);

    public CoffeeMachine() {
        currentState = waitingMoneyState;
    }
    public void insertMoney(){
        currentState.insertMoney();
    }
    public void chooseDrink(String drink){
        currentState.chooseDrink(drink);
    }
    public void dispense(){
        currentState.dispense();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void setSelectedDrink(String selectedDrink) {
        this.selectedDrink = selectedDrink;
    }
}
