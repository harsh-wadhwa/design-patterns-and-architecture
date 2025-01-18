package TextEditorExample;

import java.util.Stack;

public class Caretaker {

    private final Stack<TextEditor.Memento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (history.isEmpty()) {
            System.out.println("No states to undo");
        } else {
            editor.restore(history.pop());
        }
    }

}
