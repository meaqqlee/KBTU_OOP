package Labs.Lab2.Task5;

public class PhDStudent extends Person{
    private String specialty;

    public PhDStudent(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public void assignPet(Animal animal) {
        if(animal instanceof Dog) {
            super.assignPet(animal);
        } else {
            System.out.println("bro he is not a responsble enough");
        }
    }

    @Override
    public String toString() {
        return "PhDStudent [specialty=" + specialty + "]";
    }
}
