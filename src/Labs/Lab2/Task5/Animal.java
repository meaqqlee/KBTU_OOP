package Labs.Lab2.Task5;

public class Animal {
    private final String name;
    private int age;
    private Person owner;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getSound() {
        System.out.println("making some sound I dont know");
    }

    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}
