package Practices.Practice6.Abstracts;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    void breathe() {
        System.out.println("The animal is breathing");
    }
}
