package Practices.Practice6;

import Practices.Practice6.Interfaces.CanHavePizza;

public class Restaurant {
    public void servePizza(CanHavePizza eater) {
        if(eater instanceof Student student) {

            int temp = ((Student) eater).getCash();
            if (student.payment()) {
                System.out.println("current cash is " + temp);
                System.out.printf("student successfully bought pizza for 5 dollars and now he has %d dollars.%n", student.getCash());
            } else {
                System.out.println("not enough money. get a job lil student");
                return;
            }
        }
        eater.eatPizza();
    }
}
