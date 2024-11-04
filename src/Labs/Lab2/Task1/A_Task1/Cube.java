package Labs.Lab2.Task1.A_Task1;

public class Cube extends Shape3D {
    private float length;

    Cube(float length) {
        this.length = length;
    }

    @Override
    public float surfaceArea() {
        return 6 * length * length;
    }

    @Override
    public float volume() {
        return length * length * length;
    }
}
