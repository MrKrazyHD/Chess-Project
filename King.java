public class King extends ChessPiece {
    public King(Color color){
        super(color);
    }
    public boolean legalMove(String moveStr, ChessBoard[][] boards){
        return true;
    }
}
