package Labs.Lab3.Task3.combinesOfInterfaces;

import Labs.Lab3.Task3.Interfaces.Duplicates.DuplicatesAllowed;
import Labs.Lab3.Task3.Interfaces.Orders.UnorderedCollection;

import java.util.ArrayList;
import java.util.List;

public class UnorderedDuplicatesCollection<T> implements UnorderedCollection<T>, DuplicatesAllowed<T> {
    private List<T> elements;

    public UnorderedDuplicatesCollection() {
        this.elements = new ArrayList<>();
    }

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
