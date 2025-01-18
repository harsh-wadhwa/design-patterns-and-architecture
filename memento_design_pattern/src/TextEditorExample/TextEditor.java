package TextEditorExample;

// Originator:
public class TextEditor {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
    }


    // Memento
    public static class Memento {
        private final String text;

        private Memento(String text) {
            this.text = text;
        }

        private String getText() {
            return text;
        }

    }

}
