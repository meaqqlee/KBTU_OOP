package Labs.Lab3.Task3.Interfaces.Orders;

import Labs.Lab3.Task3.Interfaces.MyCollection;

import java.util.Comparator;

public interface OrderedCollection<T> extends MyCollection<T> {
    Comparator<T> comparator();
}
