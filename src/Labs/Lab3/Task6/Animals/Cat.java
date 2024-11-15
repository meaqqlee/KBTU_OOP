package Labs.Lab3.Task6.Animals;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "meow";
    }
}
