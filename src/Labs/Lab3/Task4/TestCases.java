package Labs.Lab3.Task4;

import Labs.Lab3.Task4.Comparators.HireDateComparator;
import Labs.Lab3.Task4.Comparators.NameComparator;

import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class TestCases {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000, new Date(), "NI12345");
        Employee emp2 = new Employee("Bob", 55000, new Date(), "NI54321");

        Manager mgr1 = new Manager("Charlie", 70000, new Date(), "NI67890", 5000);
        mgr1.addTeamMember(emp1);
        mgr1.addTeamMember(emp2);

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);
        System.out.println("Manager 1: " + mgr1);

        System.out.println("Employee 1 equals Employee 2: " + emp1.equals(emp2));
        System.out.println("Employee 1 compareTo Employee 2: " + emp1.compareTo(emp2));
        System.out.println("Manager 1 compareTo Employee 1: " + mgr1.compareTo(emp1));

        Vector<Employee> employees = new Vector<>();
        employees.add(emp1);
        employees.add(emp2);
        Collections.sort(employees, new NameComparator());
        System.out.println("Employees sorted by name: " + employees);

        Collections.sort(employees, new HireDateComparator());
        System.out.println("Employees sorted by hire date: " + employees);

        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Employees sorted by name (lambda): " + employees);

        employees.sort((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()));
        System.out.println("Employees sorted by hire date (lambda): " + employees);
    }
}
