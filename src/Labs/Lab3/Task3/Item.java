package Labs.Lab3.Task3;

import java.util.Comparator;

public class Item implements Comparator<Item>, Cloneable {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return Double.compare(o1.price, o2.price);
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone(); // Клонирование объекта
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("cloning is not supported", e);
        }
    }
}
