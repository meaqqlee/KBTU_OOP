package Practices.Practice6;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Student student = new Student("Aman", 4);
        restaurant.servePizza(student);
        System.out.println();

        Student magzhan = new Student("Magzhan", 911);
        restaurant.servePizza(magzhan);
        System.out.println();

        Cat cat = new Cat();
        cat.move();
        restaurant.servePizza(cat);
    }
}
