package Labs.Lab3.Task1.Example_Interface;

import Labs.Lab3.Task1.Example_Interface.Interfaces.*;

public class Kitchen {
    public void eat(Eatable eatable) {
        eatable.eat();
    }

    public void cook(Cookable cookable) {
        cookable.cook();
    }
}
