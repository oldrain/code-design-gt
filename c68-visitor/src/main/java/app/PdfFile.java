package app;

/**
 * PdfFile
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
