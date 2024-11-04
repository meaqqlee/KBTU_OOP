package Labs.Lab1.Task5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person person) {
        kidnappedPeople.add(person);
    }

    public boolean willDragonEatOrNot() {
        int boyCount = 0;

        for(Person person : kidnappedPeople) {
            if(person.getGender() == Gender.BOY) {
                boyCount++;
            }
            else if(boyCount > 0) {
                boyCount--;
            }
            else {
                return false;
            }
        }
        return boyCount == 0;
    }
}
