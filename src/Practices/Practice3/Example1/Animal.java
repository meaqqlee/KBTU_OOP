package Practices.Practice3.Example1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes some sound XD");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }

    public void eat(String food, boolean isFavourite) {
        System.out.print(name + " eats " + food);
        if(isFavourite) {
             System.out.println(" and he is like it");
        }
        else {
            System.out.println(" he is disappointed");
        }
    }

    public String getName() {
        return name;
    }
}
