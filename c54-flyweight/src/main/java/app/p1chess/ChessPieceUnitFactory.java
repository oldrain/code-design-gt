package app.p1chess;

import java.util.HashMap;
import java.util.Map;

/**
 * ChessPieceUnitFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ChessPieceUnitFactory {

    private static final Map<Integer, ChessPieceUnit> pieceMap = new HashMap<>();

    static {
        pieceMap.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieceMap.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.BLACK));
        // ...
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieceMap.get(chessPieceId);
    }

}
