package app;

/**
 * Visitor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface Visitor {

    void visit(PdfFile file);

    void visit(PptFile file);

    void visit(WordFile file);

}
