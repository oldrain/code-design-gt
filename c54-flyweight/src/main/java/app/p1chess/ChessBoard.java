package app.p1chess;

import java.util.HashMap;
import java.util.Map;

/**
 * ChessBoard
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ChessBoard {

    private Map<Integer, ChessPiece> chessPieceMap = new HashMap<>();

    public ChessBoard() {
        this.init();
    }

    private void init() {
        this.chessPieceMap.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        this.chessPieceMap.put(2, new ChessPiece(ChessPieceUnitFactory.getChessPiece(2), 1, 0));
        // ...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        // ...
    }

}
