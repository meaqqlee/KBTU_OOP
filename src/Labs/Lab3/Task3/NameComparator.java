package Labs.Lab3.Task3;

import java.util.Comparator;

public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
