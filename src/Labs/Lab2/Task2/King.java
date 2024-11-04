package Labs.Lab2.Task2;

public class King extends Piece {
    King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int offsetX = Math.abs(position.getX() - newPosition.getX());
        int offsetY = Math.abs(position.getY() - newPosition.getY());
        return (offsetX <= 1 && offsetY <= 1);
    }
}
