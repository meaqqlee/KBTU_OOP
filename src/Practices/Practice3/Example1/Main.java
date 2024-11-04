package Practices.Practice3.Example1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("meowzhan");
        Animal animal = new Animal("idk");

        animal.sound();
        animal.eat("bruh");
        animal.eat("not bruh", true);
        System.out.println();

        cat.eat("fish");
        cat.eat("chocolate", false);
        cat.sound();
    }
}