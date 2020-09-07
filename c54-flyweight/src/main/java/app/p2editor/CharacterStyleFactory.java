package app.p2editor;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 * CharactorStyleFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class CharacterStyleFactory {

    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }

}
