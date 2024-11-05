package Practices.Practice6;

import Practices.Practice6.Abstracts.Animal;
import Practices.Practice6.Interfaces.CanHavePizza;
import Practices.Practice6.Interfaces.Movable;

import java.util.Objects;

public class Cat extends Animal implements CanHavePizza, Movable {
    String name;
    public Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eatPizza() {
        System.out.printf("%s is enjoying pizza", name);
    }

    @Override
    public void move() {
        System.out.println("cat moves");
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;


        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
