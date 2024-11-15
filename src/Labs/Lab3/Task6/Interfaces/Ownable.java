package Labs.Lab3.Task6.Interfaces;

import Labs.Lab3.Task6.Animals.Animal;

public interface Ownable {
    void assignPet(Animal pet);
    void removePet(Animal pet);
    boolean hasPets();
}
