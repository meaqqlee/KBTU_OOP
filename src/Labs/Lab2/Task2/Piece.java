package Labs.Lab2.Task2;

public abstract class Piece {
    protected Position position;

    Piece(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position b);
}
