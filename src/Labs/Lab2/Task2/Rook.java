package Labs.Lab2.Task2;

public class Rook extends Piece{
    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return (position.getX() == newPosition.getX() || position.getY() == newPosition.getY());
    }
}
