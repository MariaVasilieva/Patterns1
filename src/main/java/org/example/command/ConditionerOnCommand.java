package org.example.command;

public class ConditionerOnCommand implements Command {
    Conditioner conditioner;
    public ConditionerOnCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }
    @Override
    public void execute() {
        conditioner.turnON();
    }
}
