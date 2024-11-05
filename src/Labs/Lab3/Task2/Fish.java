package Labs.Lab3.Task2;

import Labs.Lab3.Task2.Interfaces.CanSwim;

public class Fish implements CanSwim {
    @Override
    public void move() {
        System.out.println("Fish trying to move. ");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming now. ");
    }
}
