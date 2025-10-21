package org.example.memento;

import java.util.Stack;

public class History {
    Stack<TextMemento> list = new Stack<>();
    public void save(TextMemento textMemento) {
        list.push(textMemento);
    }
    public void undo(TextEditor textEditor) {
        if (!list.isEmpty()) {
            textEditor.restore(list.pop());
        }
    }
}
