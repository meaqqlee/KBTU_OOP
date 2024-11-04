package Labs.Lab1.Task4.Student;

public class Student {
    private final String name;
    private final int id;
    private int yearOfStudy;
    private static int count = 0;

    static {
        count++;
    }

    //constructor
    public Student() {
        this(String.valueOf(count), 1);
    }
    public Student(String name) {
        this(name, 1);
    }
    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.id = count;
    }

    //methods
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void increment() {
        this.yearOfStudy++;
    }
}
