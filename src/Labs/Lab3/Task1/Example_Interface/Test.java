package Labs.Lab3.Task1.Example_Interface;

public class Test {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        Apple redApple = new Apple();
        Meat beef = new Meat();

        kitchen.eat(redApple);
        kitchen.eat(beef);

        System.out.println();

        kitchen.cook(beef);
        kitchen.eat(beef);
    }
}
