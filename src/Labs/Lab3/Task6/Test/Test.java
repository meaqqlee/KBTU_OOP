package Labs.Lab3.Task6.Test;

import Labs.Lab3.Task6.Animals.*;
import Labs.Lab3.Task6.People.*;
import Labs.Lab3.Task6.VacationHandler;

public class Test {
    public static void main(String[] args) {
        Person Aktanberdi = new Employee("Aktanberdi", 30, "Engineer");
        Person Tilek = new PhDStudent("Tilek", 26, "Comp. Science");
        Animal kurama = new Cat("kurama", 5);
        Animal rex = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 1);

        Aktanberdi.assignPet(kurama);

        //exception here
        //john.assignPet(rex);
        Aktanberdi.assignPet(tweety);

        System.out.println("Before vacation:");
        System.out.println(Aktanberdi);
        System.out.println(Tilek);

        VacationHandler.leaveAllPetsWith(Aktanberdi, Tilek);

        System.out.println("During vacation:");
        System.out.println(Aktanberdi);
        System.out.println(Tilek);

        VacationHandler.retrieveAllPetsFrom(Tilek, Aktanberdi);

        System.out.println("After vacation:");
        System.out.println(Aktanberdi);
        System.out.println(Tilek);

        VacationHandler.leaveSpecificPetWith(Aktanberdi, Tilek, kurama);
        System.out.println("After leaving kurama with Tilek:");
        System.out.println(Aktanberdi);
        System.out.println(Tilek);

        VacationHandler.retrieveSpecificPetFrom(Tilek, Aktanberdi, kurama);
        System.out.println("After retrieving kurama back:");
        System.out.println(Aktanberdi);
        System.out.println(Tilek);
    }
}

