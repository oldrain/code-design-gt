package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * ApplicationMain
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ApplicationMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder holder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (":list".equals(input)) {
                LOGGER.info("{}", inputText.getText());
            } else if (":undo".equals(input)) {
                Snapshot snapshot = holder.popSnapshot();
                inputText.restoreSnapshot(snapshot);
            } else {
                holder.pushSnapshot(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }

}
