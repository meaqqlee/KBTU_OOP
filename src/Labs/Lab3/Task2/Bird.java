package Labs.Lab3.Task2;

import Labs.Lab3.Task2.Interfaces.CanSwim;
import Labs.Lab3.Task2.Interfaces.Flyable;
import Practices.Practice6.Interfaces.Movable;

public class Bird implements Flyable, CanSwim {
    @Override
    public void move() {
        System.out.println("Bird moving on the ground. ");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying to the heaven. ");
    }

    @Override
    public void swim() {
        System.out.println("Bird dive into water to catch a fish");
    }
}
