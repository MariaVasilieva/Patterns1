package org.example.command2;
//receiver
public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public TextEditor(String text) {
        this.text.append(text);
    }

    public void appendText(String text) {
        this.text.append(text);
    }
    public String getText() {
        return text.toString();
    }
    public int deleteText(String text) {
        int index = this.text.indexOf(text);
        if(index != -1) {
            this.text.delete(index, index+text.length());
        }
        return index;
    }
    public void insertText(String text, int index) {
        this.text.insert(index, text);
    }
}
