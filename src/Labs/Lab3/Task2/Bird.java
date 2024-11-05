package Labs.Lab3.Task2;

import Labs.Lab3.Task2.Interfaces.Flyable;

public class Bird implements Flyable {
    @Override
    public void move() {
        System.out.println("Bird moving on the ground. ");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying to the heaven. ");
    }
}
