package Labs.Lab3.Task3.combinesOfInterfaces;

import Labs.Lab3.Task3.Interfaces.Duplicates.DuplicatesNotAllowed;
import Labs.Lab3.Task3.Interfaces.Orders.OrderedCollection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class OrderedUniqueCollection<T> implements DuplicatesNotAllowed<T>, OrderedCollection<T> {
    Comparator<T> comparator;
    Set<T> elements;

    public OrderedUniqueCollection(Comparator<T> comparator) {
        this.comparator = comparator;
        this.elements = new TreeSet<T>(comparator);
    }

    @Override
    public Comparator<T> comparator() {
        return comparator;
    }

    @Override
    public boolean addUnique(T element) {
        return elements.add(element);
    }

    // those are not important(mostly)

    @Override
    public boolean add(T element) {
        return elements.add(element);
    }

    @Override
    public boolean remove(T element) {
        return elements.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return elements.contains(element);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
