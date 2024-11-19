package Labs.Lab3.Task5;

public class Test {
    public static void main(String[] args) {
        //Time
        Time t1 = new Time(23, 5, 6);
        System.out.println("Universal: " + t1.toUniversal()); // 23:05:06
        System.out.println("Standard: " + t1.toStandard());   // 11:05:06 PM

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);
        System.out.println("After adding: " + t1.toUniversal()); // 03:29:39

        //Chocolate and Sort
        System.out.println();
        Chocolate[] chocolates = {
                new Chocolate("Twix",150 ),
                new Chocolate("Snickers", 100),
                new Chocolate("Mars", 200)
        };

        System.out.println("Before sorting chocolates:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Sort.bubbleSort(chocolates);
        System.out.println("After sorting chocolates by weight:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        // Sort Time
        System.out.println();
        Time[] times = {new Time(12, 45, 30),
                        new Time(6, 20, 15),
                        new Time(14, 5, 50)
        };
        Sort.mergeSort(times);
        System.out.println("Sorted times:");
        for (Time time : times) System.out.println(time.toUniversal());
    }
}