package Labs.Lab1.Task5;

public class Main {
    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.GIRL));
        launch.kidnap(new Person(Gender.GIRL));

        if (launch.willDragonEatOrNot()) {
            System.out.println("Dragon will eat.");
        } else {
            System.out.println("Dragon will not eat.");
        }

        DragonLaunch anotherLaunch = new DragonLaunch();
        anotherLaunch.kidnap(new Person(Gender.GIRL));
        anotherLaunch.kidnap(new Person(Gender.BOY));
        anotherLaunch.kidnap(new Person(Gender.GIRL));
        anotherLaunch.kidnap(new Person(Gender.BOY));

        if (anotherLaunch.willDragonEatOrNot()) {
            System.out.println("Dragon will eat.");
        } else {
            System.out.println("Dragon will not eat.");
        }
    }
}
