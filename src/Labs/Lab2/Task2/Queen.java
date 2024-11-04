package Labs.Lab2.Task2;

public class Queen extends Piece{
    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return new Rook(position).isLegalMove(newPosition) && new Bishop(position).isLegalMove(newPosition);
    }
}
