package org.example.command;
//invoker
public class RemoteControl {
    private Command command;
    public RemoteControl(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
    public void setCommand(Command command) {
        this.command = command;
    }
}
