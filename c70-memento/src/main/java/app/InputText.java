package app;

/**
 * InputText
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class InputText {

    private StringBuilder text = new StringBuilder();

    public String getText() {
        return this.text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text.toString());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }

}
