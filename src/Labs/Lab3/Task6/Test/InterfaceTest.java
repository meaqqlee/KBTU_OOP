package Labs.Lab3.Task6.Test;

import Labs.Lab3.Task6.Animals.*;
import Labs.Lab3.Task6.People.*;

public class InterfaceTest {
    public static void main(String[] args) {
        Person Aktanberdi = new Employee("Aktanberdi", 30, "Engineer");
        Animal kurama = new Cat("kurama", 5);
        Animal rex = new Dog("Rex", 3);

        Aktanberdi.assignPet(kurama);
        Aktanberdi.assignPet(rex);

        System.out.println(Aktanberdi);
        System.out.println("kurama says: " + kurama.makeSound());
        System.out.println("Rex says: " + rex.makeSound());

        Person Tilek = new PhDStudent("Tilek", 26, "Comp. Science");
        System.out.println("Comparing names of Aktanberdi and Tilek: " + Aktanberdi.compareTo(Tilek));
    }
}