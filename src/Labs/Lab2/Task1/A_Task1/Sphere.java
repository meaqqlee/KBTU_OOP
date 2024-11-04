package Labs.Lab2.Task1.A_Task1;

public class Sphere extends Shape3D{
    private static final float PI = 3.14159f;
    private float radius;

    Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public float surfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public float volume() {
        return ((float) 4 /3) * PI * radius * radius * radius;
    }
}
