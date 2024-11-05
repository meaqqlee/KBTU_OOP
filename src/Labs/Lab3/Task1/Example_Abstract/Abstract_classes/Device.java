package Labs.Lab3.Task1.Example_Abstract.Abstract_classes;

public abstract class Device {

    public abstract boolean isChargeable();
    public abstract boolean isBatteryFull();
    public abstract boolean isWireless();

    public void charge() {
        if(isChargeable()){
            System.out.println("Your device on charge. ");
        } else {
            System.out.println("Your device isn't chargeable");
        }
    }
}
