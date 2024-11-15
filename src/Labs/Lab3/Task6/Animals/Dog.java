package Labs.Lab3.Task6.Animals;

public class Dog extends Animal {

    {
        setDependence(false);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Woof";
    }
}
