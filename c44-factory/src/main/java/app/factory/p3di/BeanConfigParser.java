package app.factory.p3di;

import java.io.InputStream;
import java.util.List;

/**
 * BeanConfigParser
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface BeanConfigParser {

    /**
     *
     * <p>
     * @param inputStream inputStream
     * @return List<BeanDefinition>
     * @author roy
     *
     */
    List<BeanDefinition> parse(InputStream inputStream);

    /**
     *
     * <p>
     * @param cfgContent cfgContent
     * @return List<BeanDefinition>
     * @author roy
     *
     */
    List<BeanDefinition> parse(String cfgContent);

}
