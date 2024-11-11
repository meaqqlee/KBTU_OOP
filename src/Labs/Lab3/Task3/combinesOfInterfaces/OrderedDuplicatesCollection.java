package Labs.Lab3.Task3.combinesOfInterfaces;

import Labs.Lab3.Task3.Interfaces.Duplicates.DuplicatesAllowed;
import Labs.Lab3.Task3.Interfaces.Orders.OrderedCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderedDuplicatesCollection<T> implements DuplicatesAllowed<T>, OrderedCollection<T> {
    private Comparator<T> comparator;
    private List<T> elements;

    public OrderedDuplicatesCollection(Comparator<T> comparator) {
        this.comparator = comparator;
        this.elements = new ArrayList<T>();
    }

    @Override
    public Comparator<T> comparator() {
        return null;
    }

    @Override
    public boolean add(T element) {
        elements.add(element);
        elements.sort(comparator);
        return true;
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
