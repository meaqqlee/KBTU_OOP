package Labs.Lab3.Task3.Interfaces.Duplicates;

import Labs.Lab3.Task3.Interfaces.MyCollection;

public interface DuplicatesNotAllowed<T> extends MyCollection<T> {
    @Override
    default boolean add(T element) {
        if(this.contains(element)) {
            return false;
        }
        return addUnique(element);
    }

    boolean addUnique(T element);
}
