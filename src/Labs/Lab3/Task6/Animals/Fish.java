package Labs.Lab3.Task6.Animals;

public class Fish extends Animal {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Blob";
    }
}
