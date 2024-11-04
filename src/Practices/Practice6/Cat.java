package Practices.Practice6;

import Practices.Practice6.Abstracts.Animal;
import Practices.Practice6.Interfaces.CanHavePizza;
import Practices.Practice6.Interfaces.Movable;

public class Cat extends Animal implements CanHavePizza, Movable {
    @Override
    public void eatPizza() {
        System.out.println("cat is enjoying pizza");
    }

    @Override
    public void move() {
        System.out.println("cat moves");
    }
}
