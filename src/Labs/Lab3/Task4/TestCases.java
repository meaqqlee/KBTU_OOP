package Labs.Lab3.Task4;

import Labs.Lab3.Task4.Comparators.HireDateComparator;
import Labs.Lab3.Task4.Comparators.NameComparator;

import java.util.Date;
import java.util.Vector;

public class TestCases {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", 50000, new Date(), "NI12345");
        Employee emp2 = new Employee("Bob", 55000, new Date(), "NI54321");
        emp2.setSalary(59000.0f);
        Employee emp3 = new Employee("Darvin", 23000, new Date(), "NI845621");

        Manager mgr1 = new Manager("Charlie", 70000, new Date(), "NI67890", 5000);
        mgr1.addTeamMember(emp3);
        mgr1.addTeamMember(emp1);
        mgr1.addTeamMember(emp2);

        mgr1.addBonus(100.0f);

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);
        System.out.println("Manager 1: " + mgr1);

        System.out.println("Employee 1 equals Employee 2: " + emp1.equals(emp2));
        System.out.println("Employee 1 compareTo Employee 2: " + emp1.compareTo(emp2));
        System.out.println("Manager 1 compareTo Employee 1: " + mgr1.compareTo(emp1));

        Vector<Employee> employees = new Vector<>();
        employees.add(emp3);
        employees.add(emp1);
        employees.add(emp2);

        employees.sort(new NameComparator());
        System.out.println("Employees sorted by name: " + employees);

        employees.sort(new HireDateComparator());
        System.out.println("Employees sorted by hire date: " + employees);

        //test for my manager's compareTo
        System.out.println();

        employees.add(mgr1);

        employees.sort(null);
        System.out.println("Employees and manager sorted by salary (and bonus for managers):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Manager mgr2 = new Manager("Eve", 70000, new Date(), "NI11223", 6000);
        Manager mgr3 = new Manager("Frank", 75000, new Date(), "NI44556", 3000);

        System.out.println("mgr1 compareTo mgr2 (equal salary, bonus comparison): " + mgr1.compareTo(mgr2)); // -1
        System.out.println("mgr1 compareTo mgr3 (different salary): " + mgr1.compareTo(mgr3)); // -1
        System.out.println("mgr3 compareTo mgr2 (different salary): " + mgr3.compareTo(mgr2)); // 1

        // equals test
        Manager mgr4 = new Manager("Charlie", 70000, new Date(), "NI67890", 5000); // copy
        System.out.println("mgr1 equals mgr4: " + mgr1.equals(mgr4));
    }
}
