package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extractor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Extractor implements Visitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(Extractor.class);

    @Override
    public void visit(PdfFile file) {
        LOGGER.info("Extractor PDF...");
    }

    @Override
    public void visit(PptFile file) {
        LOGGER.info("Extractor PPT...");
    }

    @Override
    public void visit(WordFile file) {
        LOGGER.info("Extractor WORD...");
    }
}
