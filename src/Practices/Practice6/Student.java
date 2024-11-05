package Practices.Practice6;

import Practices.Practice6.Abstracts.Person;
import Practices.Practice6.Interfaces.CanHavePizza;
import Practices.Practice6.Interfaces.Movable;

import java.util.Objects;

public class Student extends Person implements CanHavePizza, Movable {
    int cash;
    String name;

    public Student(String name, int cash) {
        super(name);
        this.cash = cash;
    }

    @Override
    public void eatPizza() {
        System.out.println("student finally eats something and its pizza");
    }

    @Override
    public void move() {
        System.out.println("student makes some moves");
    }

    public boolean payment() {
        if(cash - 5 >= 0) {
            cash -= 5;
            return true;
        } else {
            return false;
        }
    }

    public int getCash() {
        return cash;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;


        Student student = (Student) o;
        return cash == student.cash && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cash);
    }

    @Override
    public String toString() {
        return "name: " + name + ", cash: " + cash;
    }
}
