package Practices.Practice2;

public class Student {
    private String name;
    private int year;
    private int id;


    Student(String name, int age) {
        this.name = name;
        this.id = age;
        this.year = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void incrementYear() {
        this.year++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        Student s1 = new Student("John Doe", 18);
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getYear());
        s1.setName("magzhan");
        System.out.println(s1.getName());
    }
}
