package Labs.Lab3.Task1.Example_Abstract;

public class Test {
    public static void main(String[] args) {

        Pixel pixel8Pro = new Pixel(70);
        pixel8Pro.charge();

        if(pixel8Pro.isWireless()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if(pixel8Pro.isBatteryFull()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
