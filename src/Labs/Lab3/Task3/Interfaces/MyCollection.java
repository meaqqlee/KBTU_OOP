package Labs.Lab3.Task3.Interfaces;

public interface MyCollection<T> {
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    void clear();
}
