package Labs.Lab3.Task3;

import Labs.Lab3.Task3.Interfaces.MyCollection;
import Labs.Lab3.Task3.combinesOfInterfaces.OrderedDuplicatesCollection;
import Labs.Lab3.Task3.combinesOfInterfaces.OrderedUniqueCollection;
import Labs.Lab3.Task3.combinesOfInterfaces.UnorderedDuplicatesCollection;
import Labs.Lab3.Task3.combinesOfInterfaces.UnorderedUniqueCollection;

import java.util.Comparator;

public class CollectionTest {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a < b) return -1;
                else if (a.equals(b)) return 0;
                else return 1;
            }
        };

        OrderedDuplicatesCollection<Integer> orderedDuplicatesCollection = new OrderedDuplicatesCollection<>(comparator);
        testCollection("ordered and can duplicate: ", orderedDuplicatesCollection);

        OrderedUniqueCollection<Integer> orderedUniqueCollection = new OrderedUniqueCollection<>(comparator);
        testCollection("ordered and Unique: ", orderedUniqueCollection);

        UnorderedDuplicatesCollection<Integer> unorderedDuplicatesCollection = new UnorderedDuplicatesCollection<>();
        testCollection("unordered and can duplicate: ", unorderedDuplicatesCollection);

        UnorderedUniqueCollection<Integer> unorderedUniqueCollection = new UnorderedUniqueCollection<>();
        testCollection("unordered and Unique: ", unorderedUniqueCollection);
    }

    private static void testCollection(String name, MyCollection<Integer> collection) {
        System.out.println("Testing collection: " + name);

        collection.add(10);
        collection.add(5);
        collection.add(3);
        collection.add(3);

        System.out.println("Elements after adding: " + collection);

        if (collection instanceof OrderedUniqueCollection || collection instanceof OrderedDuplicatesCollection) {
            System.out.println("Order check: " + collection);
        }

        System.out.println("Contains 5? " + collection.contains(5));

        System.out.println("Size: " + collection.size());

        collection.remove(5);
        System.out.println("Elements after removing 5: " + collection);

        collection.clear();
        System.out.println("Elements after clearing: " + collection);
        System.out.println("Is collection empty? " + collection.isEmpty());
        System.out.println();
    }
}
