package app.generator;

/**
 * ID generator
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface IdGenerator {
    /**
     * 生成 ID
     *
     * <p>
     * @return java.lang.String
     * @author roy
     *
     */
    String generate() throws IdGenerationFailureException;

}
