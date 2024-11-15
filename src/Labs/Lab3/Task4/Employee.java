package Labs.Lab3.Task4;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
    private double salary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name,
                    double salary,
                    Date hireDate,
                    String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() +
                "', salary='" + getSalary() +
                "', hireDate='" + getHireDate() +
                "', nationalInsuranceNumber='" + getNationalInsuranceNumber() +
                "'}";
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(!super.equals(object)) return false;
        if(getClass() != object.getClass()) return false;
        Employee other = (Employee) object;
        return Double.compare(getSalary(), other.getSalary()) == 0 &&
                Objects.equals(getHireDate(), other.getHireDate()) &&
                Objects.equals(getNationalInsuranceNumber(), other.getNationalInsuranceNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                getSalary(),
                getHireDate(),
                getNationalInsuranceNumber()
        );
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.getSalary(), other.getSalary());
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{
        return (Employee) super.clone();
    }
}