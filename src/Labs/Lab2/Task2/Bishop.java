package Labs.Lab2.Task2;

public class Bishop extends Piece {
    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int offsetX = Math.abs(position.getX() - newPosition.getX());
        int offsetY = Math.abs(position.getY() - newPosition.getY());
        return (offsetX == offsetY);
    }
}
