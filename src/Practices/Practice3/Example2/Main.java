package Practices.Practice3.Example2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person> people = new HashSet<>();

        people.add(new Student("Magzan", "Raiymbek", "SITE", 2, 2500));
        people.add(new Staff("some dude", "unknown", "KBTU", 9.11));

        boolean running = true;
        while(running) {
            System.out.println("1. Add person \n2.View all the persons \n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("input the name: ");
                    String name = scanner.nextLine();
                    System.out.println("input the address: ");
                    String address = scanner.nextLine();
                    System.out.println("Student or Staff: ");
                    String type = scanner.nextLine();

                    if(type.equalsIgnoreCase("student")) {
                        System.out.println("input the program: ");
                        String program = scanner.nextLine();
                        System.out.println("input the year: ");
                        int year = scanner.nextInt();
                        System.out.println("input the fee: ");
                        double fee = scanner.nextDouble();

                        people.add(new Student(name, address, program, year, fee));
                    }
                case 2:
                    for(Person person : people) {
                        System.out.println(person);
                    }
                case 3:
                    running = false;
            }
        }
    }
}