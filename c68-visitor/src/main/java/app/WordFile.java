package app;

/**
 * WordFile
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
