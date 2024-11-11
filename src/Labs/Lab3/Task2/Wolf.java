package Labs.Lab3.Task2;

import Labs.Lab3.Task2.Interfaces.CanSwim;
import Labs.Lab3.Task2.Interfaces.Moveable;

public class Wolf implements Moveable, CanSwim {
    @Override
    public void move() {
        System.out.println("Wolf moves toward the forest. ");
    }

    public void swim() {
        System.out.println("Wolf trying to swim lol");
    }
}
