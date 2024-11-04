package Labs.Lab2.Task5;

public class Main {
    public static void main(String[] args) {
        // Create some Person and Animal objects
        Person john = new Employee("John", 30, 53945039);
        Person alice = new PhDStudent("Alice", 26, "Computer Science");

        Animal buddy = new Dog("Buddy", 3, "german idk");

        alice.assignPet(buddy); // This will not work for Alice as she's a PhDStudent

        // Create a PersonRegistry and add people to it
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        // Print details of the registry
        System.out.println("Registry after adding people and assigning pets:");
        System.out.println(registry);

        // Check who has pets
        System.out.println("People with pets:");
        for (Person person : registry.findPeopleWithPets()) {
            System.out.println(person);
        }

        // Check who does not have pets
        System.out.println("People without pets:");
        for (Person person : registry.findPeopleWithoutPets()) {
            System.out.println(person);
        }

        // Simulate a vacation scenario
        john.getOccupation(alice); // John leaves Murka with Alice

        System.out.println("Registry after John leaves Murka with Alice:");
        System.out.println(registry);

        // John retrieves his pet back from Alice
        john.retrieveFromSomeone(alice);

        System.out.println("Registry after John retrieves Murka back from Alice:");
        System.out.println(registry);
    }
}
