package Labs.Lab2.Task5;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void getSound() {
        System.out.println("AW AW AW AW AWWWWW");
    }
}
