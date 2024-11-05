package Labs.Lab3.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Laptop", 999.99));
        items.add(new Item("Smartphone", 799.49));
        items.add(new Item("Tablet", 299.99));

        Collections.sort(items);
        System.out.println("Сортировка по цене (естественный порядок): " + items);

        items.sort(new NameComparator());
        System.out.println("Сортировка по имени: " + items);

        items.sort(new PriceDescendingComparator());
        System.out.println("Сортировка по цене (в обратном порядке): " + items);

        Item originalItem = new Item("Headphones", 199.99);
        Item clonedItem = originalItem.clone();
        System.out.println("Оригинальный объект: " + originalItem);
        System.out.println("Клонированный объект: " + clonedItem);
    }
}
