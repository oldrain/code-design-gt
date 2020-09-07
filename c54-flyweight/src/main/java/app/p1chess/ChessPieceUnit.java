package app.p1chess;

/**
 * ChessPieceUnit
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ChessPieceUnit {

    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        /**
         *
         */
        RED, BLACK
    }

}
