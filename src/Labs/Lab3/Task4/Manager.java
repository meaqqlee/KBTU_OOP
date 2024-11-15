package Labs.Lab3.Task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee> {
    private final Vector<Employee> team;
    private double bonus;

    public Manager(String name,
                   double salary,
                   Date hireDate,
                   String nationalInsuranceNumber,
                   double bonus
                   ) {
        super(name, salary, hireDate, nationalInsuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public void addTeamMember(Employee employee) {
        team.add(employee);
    }

    public double getBonus() {
        return bonus;
    }

    public void addBonus(double bonus) {
        this.bonus += bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() +
                "', salary='" + getSalary() +
                "', hireDate='" + getHireDate() +
                "', nationalInsuranceNumber='" + getNationalInsuranceNumber() +
                "', bonus='" + getBonus() +
                "'}";
    }

    @Override
    public boolean equals(Object object) {
        if(!super.equals(object)) return false;
        if(getClass() != object.getClass()) return false;

        Manager other = (Manager) object;
        return Double.compare(getBonus(), other.getBonus()) == 0 ||
                Objects.equals(getTeam(), other.getTeam()
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus, team);
    }

    @Override
    public int compareTo(Employee other) {
        if(other instanceof Manager manager) {
            if(Double.compare(this.getSalary(), manager.getSalary()) == 0) {
                return Double.compare(this.getBonus(), manager.getBonus());
            }
        }
        return super.compareTo(other);
    }
}
