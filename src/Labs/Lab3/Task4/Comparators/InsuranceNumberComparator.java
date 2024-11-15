package Labs.Lab3.Task4.Comparators;

import Labs.Lab3.Task4.Employee;

import java.util.Comparator;

public class InsuranceNumberComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getNationalInsuranceNumber().compareTo(o2.getNationalInsuranceNumber());
    }
}
