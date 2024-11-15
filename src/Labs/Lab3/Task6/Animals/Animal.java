package Labs.Lab3.Task6.Animals;

import Labs.Lab3.Task6.Interfaces.Soundable;

import java.io.Serializable;
import java.util.Objects;

public abstract class Animal implements Soundable, Serializable {
    private final String name;
    private int age;
    private boolean isIndependent = true;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String makeSound() {
        return getSound();
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getIndependence() {
        return isIndependent;
    }

    public void setDependence(boolean isIndependent) {
        this.isIndependent = isIndependent;
    }
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(other == null || getClass() != other.getClass()) return false;
        Animal animal = (Animal) other;
        return age == animal.age && name.equals(animal.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " [" + getClass().getSimpleName() + ", " + age + " year]";
    }
}
