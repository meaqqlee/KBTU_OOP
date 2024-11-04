package Labs.Lab2.Task2;

public class Pawn extends Piece {
    private boolean isWhite;
    public Pawn(Position position, boolean isWhite) {
        super(position);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int direction = isWhite ? -1 : 1;
        int offsetX = position.getX() - newPosition.getX();
        int offsetY = position.getY() - newPosition.getY();

        return (offsetX == 0 && offsetY == direction) || ((offsetX == 0 && offsetY == 2 * direction) && (position.getY() == 2 || position.getY() == 7));
    }
}
