package app.p2editor;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 * Editor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Editor {

    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        this.chars.add(character);
    }

}
