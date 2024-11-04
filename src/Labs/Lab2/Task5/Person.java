package Labs.Lab2.Task5;

import java.util.Objects;

public class Person {
    private final String name;
    private int age;
    private Animal animal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal animal) {
        this.animal = animal;
    }
    
    public void removePet() {
        this.animal = null;
    }
    
    public boolean hasPet() {
        return this.animal != null;
    }
    
    public void getOccupation(Person occupator) {
        occupator.assignPet(this.animal);
        this.removePet();
    }

    public void retrieveFromSomeone(Person occupator) {
        if(!this.hasPet() && occupator.hasPet()) {
            this.assignPet(occupator.animal);
            occupator.removePet();
        }
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    public String toString() {
        return this.name + " " + this.age;
    }
}
