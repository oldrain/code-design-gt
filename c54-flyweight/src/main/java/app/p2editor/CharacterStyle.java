package app.p2editor;

import java.awt.Font;

/**
 * CharacterStyle
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class CharacterStyle {

    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object obj) {
        CharacterStyle other = (CharacterStyle) obj;
        return this.font.equals(other.font)
                && this.size == other.size
                && this.colorRGB == other.colorRGB;
    }

}
