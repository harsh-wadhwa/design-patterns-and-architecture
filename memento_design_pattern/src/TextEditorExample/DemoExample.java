package TextEditorExample;

public class DemoExample {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Caretaker caretakerForEditor = new Caretaker();

        editor.setText("hello this is harsh");
        caretakerForEditor.save(editor); // storing editor's current state after a change
        System.out.println("Current text: " + editor.getText());

        editor.setText("no this is alter harsh");
        System.out.println("Current text: " + editor.getText());

        caretakerForEditor.undo(editor);
        System.out.println("Current text after undo:" + editor.getText());

    }
}
