public class Pawn extends ChessPiece {
    public Pawn(Color color) {
        super(color);
    }

    public boolean legalMove(String moveStr, ChessBoard[][] boards) {
        return true;
    }
}
