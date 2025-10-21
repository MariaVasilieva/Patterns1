package org.example.memento;

public class TextEditor {
    private String text = "";
    public TextEditor(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void type(String text) {
        this.text += text;
    }
    public TextMemento save() {
        return new TextMemento(text);
    }
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}
