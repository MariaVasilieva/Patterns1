package org.example.command2;

public class DeleteTextCommand implements Command {
    private final TextEditor textEditor;
    private final String text;
    private int position;
    public DeleteTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }
    @Override
    public void execute() {
        position = textEditor.deleteText(text);
    }

    @Override
    public void undo() {
        textEditor.insertText(text, position);
    }
}
