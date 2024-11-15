package Labs.Lab3.Task6.People;

import Labs.Lab3.Task6.Animals.Animal;
import Labs.Lab3.Task6.Interfaces.Ownable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Person implements Ownable, Comparable<Person> {
    private final String name;
    private int age;
    private List<Animal> pets;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pets = new ArrayList<>();
    }

    public abstract String getOccupation();

    //interface implements:
    @Override
    public void assignPet(Animal pet) {
        pets.add(pet);
    }
    @Override
    public void removePet(Animal pet) {
        pets.remove(pet);
    }
    @Override
    public boolean hasPets() {
        return !pets.isEmpty();
    }

    //pets
    public ArrayList<Animal> getPets() {
        return new ArrayList<Animal>(pets);
    }

    //other stuff
    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Occupation: %s, Pets: [%s]",
                name, age, getOccupation(), ", have " + pets.size() + " pets.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Person person = (Person) other;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
