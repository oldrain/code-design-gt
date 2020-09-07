package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Compressor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Compressor implements Visitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(Compressor.class);

    @Override
    public void visit(PdfFile file) {
        LOGGER.info("Compressor PDF...");
    }

    @Override
    public void visit(PptFile file) {
        LOGGER.info("Compressor PPT...");
    }

    @Override
    public void visit(WordFile file) {
        LOGGER.info("Compressor WORD...");
    }
}
