package Practices.Practice3.Example1;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("meowwww");
    }

    public void eat(String food) {
        System.out.println(getName() + " eats " + food);
    }

    public void eat(String food, boolean isFavourite) {
        System.out.print(getName() + " eats " + food);
            System.out.println(" he is frustrated");
    }
}
