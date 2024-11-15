package Labs.Lab3.Task5;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Chocolate other) {
        return Double.compare(getWeight(), other.getWeight());
    }

    public String toString() {
        return "Chocolate{name='" + getName() +
                "', weight='" + getWeight() +
                "g'}";
    }
}
