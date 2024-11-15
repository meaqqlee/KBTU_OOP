package Labs.Lab3.Task6.Test;

import Labs.Lab3.Task6.Animals.*;
import Labs.Lab3.Task6.People.*;

public class InterfaceTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);

        john.assignPet(murka);
        john.assignPet(rex);

        System.out.println(john);
        System.out.println("Murka says: " + murka.makeSound());
        System.out.println("Rex says: " + rex.makeSound());

        Person alice = new PhDStudent("Alice", 26, "Comp. Science");
        System.out.println("Comparing names of John and Alice: " + john.compareTo(alice));
    }
}