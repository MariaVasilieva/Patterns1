package org.example.command2;



public class AddTextCommand implements Command {
    private final TextEditor textEditor;
    private final String text;
    public AddTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }
    @Override
    public void execute() {
        textEditor.appendText(text);
    }

    @Override
    public void undo() {
        textEditor.deleteText(text);
    }
}
