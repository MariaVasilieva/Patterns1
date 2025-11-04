package org.example.command2;

import java.util.Stack;

public class TextManager {
    private final Stack<Command> undoCommands = new Stack<>();
    private final Stack<Command> redoCommands = new Stack<>();

    public void execute(Command cmd) {
        cmd.execute();
        undoCommands.push(cmd);
    }
    public void undo() {
        if(!undoCommands.isEmpty()) {
            Command cmd = undoCommands.pop();
            cmd.undo();
            redoCommands.push(cmd);
        }
    }
    public void redo() {
        if(!redoCommands.isEmpty()) {
            Command cmd = redoCommands.pop();
            cmd.execute();
            undoCommands.push(cmd);
        }
    }
}
