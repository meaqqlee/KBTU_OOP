package Labs.Lab3.Task3.combinesOfInterfaces;

import Labs.Lab3.Task3.Interfaces.Duplicates.DuplicatesNotAllowed;
import Labs.Lab3.Task3.Interfaces.Orders.UnorderedCollection;

import java.util.HashSet;
import java.util.Set;

public class UnorderedUniqueCollection<T> implements DuplicatesNotAllowed<T>, UnorderedCollection<T> {
    Set<T> elements;

    public UnorderedUniqueCollection() {
        this.elements = new HashSet<T>();
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
