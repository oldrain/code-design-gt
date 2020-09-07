package app;

/**
 * PPTFile
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class PptFile extends ResourceFile {

    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
