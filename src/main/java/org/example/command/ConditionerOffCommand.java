package org.example.command;

public class ConditionerOffCommand implements Command {
    Conditioner conditioner;
    public ConditionerOffCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }
    @Override
    public void execute() {
        conditioner.turnOFF();
    }
}
