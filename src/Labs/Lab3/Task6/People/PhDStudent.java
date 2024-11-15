package Labs.Lab3.Task6.People;

import Labs.Lab3.Task6.Animals.Animal;

public class PhDStudent extends Person {
    private String researchField;

    public PhDStudent(String name, int age, String researchField) {
        super(name, age);
        this.researchField = researchField;
    }

    @Override
    public String getOccupation() {
        return "PhD Student (" + researchField + ")";
    }

    @Override
    public void assignPet(Animal pet) {
        if (!pet.getIndependence()) {
            throw new IllegalArgumentException("PhD students cannot have dependent pets.");
        }
        super.assignPet(pet);
    }
}
