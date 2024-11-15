package Labs.Lab3.Task6;

import Labs.Lab3.Task6.Animals.Animal;
import Labs.Lab3.Task6.People.Person;

import java.util.ArrayList;
import java.util.List;

public class VacationHandler {
    private static final List<Animal> tempTransferredPets = new ArrayList<>();

    public static void leaveAllPetsWith(Person owner, Person caretaker) {
        if (!owner.hasPets()) {
            throw new IllegalArgumentException(owner + " does not have any pets to leave.");
        }

        for (Animal pet : new ArrayList<>(owner.getPets())) {
            owner.removePet(pet);
            caretaker.assignPet(pet);
            tempTransferredPets.add(pet);
        }
    }

    public static void retrieveAllPetsFrom(Person caretaker, Person owner) {
        for (Animal pet : new ArrayList<>(caretaker.getPets())) {
            if (tempTransferredPets.contains(pet)) {
                caretaker.removePet(pet);
                owner.assignPet(pet);
                tempTransferredPets.remove(pet);
            }
        }
    }

    public static void leaveSpecificPetWith(Person owner, Person caretaker, Animal pet) {
        if (!owner.getPets().contains(pet)) {
            throw new IllegalArgumentException(owner + " does not own this pet.");
        }
        owner.removePet(pet);
        caretaker.assignPet(pet);
        tempTransferredPets.add(pet);
    }

    public static void retrieveSpecificPetFrom(Person caretaker, Person owner, Animal pet) {
        if (!caretaker.getPets().contains(pet)) {
            throw new IllegalArgumentException(caretaker + " does not have this pet.");
        }
        if (tempTransferredPets.contains(pet)) {
            caretaker.removePet(pet);
            owner.assignPet(pet);
            tempTransferredPets.remove(pet);
        }
    }
}
