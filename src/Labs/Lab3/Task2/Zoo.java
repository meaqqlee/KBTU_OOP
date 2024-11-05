package Labs.Lab3.Task2;

import Labs.Lab3.Task2.Interfaces.*;

public class Zoo {
    public void makeItMove(Moveable moveable) {
        moveable.move();
    }
    public void makeItFly(Flyable flyable) {
        flyable.fly();
    }
    public void makeItSwim(CanSwim canSwim) {
        canSwim.swim();
    }
}
