package Labs.Lab3.Task6.Test;

import Labs.Lab3.Task6.Animals.*;
import Labs.Lab3.Task6.People.*;
import Labs.Lab3.Task6.VacationHandler;

public class Test {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science");
        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 1);

        john.assignPet(murka);

        //exception here
        //john.assignPet(rex);
        john.assignPet(tweety);

        System.out.println("Before vacation:");
        System.out.println(john);
        System.out.println(alice);

        VacationHandler.leaveAllPetsWith(john, alice);

        System.out.println("During vacation:");
        System.out.println(john);
        System.out.println(alice);

        VacationHandler.retrieveAllPetsFrom(alice, john);

        System.out.println("After vacation:");
        System.out.println(john);
        System.out.println(alice);

        VacationHandler.leaveSpecificPetWith(john, alice, murka);
        System.out.println("After leaving Murka with Alice:");
        System.out.println(john);
        System.out.println(alice);

        VacationHandler.retrieveSpecificPetFrom(alice, john, murka);
        System.out.println("After retrieving Murka back:");
        System.out.println(john);
        System.out.println(alice);
    }
}

