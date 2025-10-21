package org.example;


import org.example.memento.History;
import org.example.memento.TextEditor;
import org.example.memento.TextMemento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello World");
        System.out.println(textEditor.getText());
        History history = new History();
        TextMemento save1 = textEditor.save();
        history.save(save1);
        textEditor.type("!");
        System.out.println(textEditor.getText());
        TextMemento save2 = textEditor.save();
        history.save(save2);
        textEditor.type("!");
        System.out.println(textEditor.getText());
        TextMemento save3 = textEditor.save();
        history.save(save3);
        textEditor.type("@");
        System.out.println(textEditor.getText());
        history.undo(textEditor);
        System.out.println(textEditor.getText());
    }
}