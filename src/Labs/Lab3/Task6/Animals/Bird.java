package Labs.Lab3.Task6.Animals;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "HAWWKKKK";
    }
}
