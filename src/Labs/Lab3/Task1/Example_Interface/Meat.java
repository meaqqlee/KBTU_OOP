package Labs.Lab3.Task1.Example_Interface;

import Labs.Lab3.Task1.Example_Interface.Interfaces.*;

public class Meat implements Eatable, Cookable {
    private boolean isCooked = false;
    @Override
    public void cook() {
        isCooked = true;
        System.out.println("You cooked that meat bro. ");
    }

    @Override
    public void eat() {
        if(isCooked) {
            System.out.println("You ate that cooked meat");
        } else {
            System.out.println("bro are you wild? It's still raw... ");
        }
    }
}
