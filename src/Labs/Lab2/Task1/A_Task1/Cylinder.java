package Labs.Lab2.Task1.A_Task1;

public class Cylinder extends Shape3D{
    private static final float PI = 3.14169f;
    private float radius;
    private float height;

    Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float surfaceArea() {
        return (((2 * PI * radius) * height) + (2 * PI * radius * radius));
    }

    @Override
    public float volume() {
        return (PI * radius * radius) * height;
    }
}
