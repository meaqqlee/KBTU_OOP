package Labs.Lab3.Task6;

import Labs.Lab3.Task6.People.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> getPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPets()) result.add(person);
        }
        return result;
    }

    public List<Person> getPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (!person.hasPets()) result.add(person);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Person Registry:\n");
        for (Person person : people) {
            builder.append(person).append("\n");
        }
        return builder.toString();
    }
}

