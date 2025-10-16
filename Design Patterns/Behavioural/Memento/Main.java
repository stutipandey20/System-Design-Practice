// package Design Patterns.Behavioural.Memento;

import java.util.*;

import org.w3c.dom.Text;

class TextMemento {
    private String state;

    public TextMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}   

class TextEditor {
    private String text = "";

    public void type(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        text = memento.getState();
    }
}

class TextHistory {

    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }   
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Memento Pattern Example");

        TextEditor textEditor = new TextEditor();
        TextHistory textHistory = new TextHistory();

        textEditor.type("Hello, ");
        textEditor.type("world!");

        textHistory.save(textEditor.save()); // Save state

        textEditor.type("This is a new text.");
        System.out.println("Current Text: " + textEditor.getText());

        // undo operation
        textEditor.restore(textHistory.undo());
        System.out.println("After Undo: " + textEditor.getText());
    }
}
