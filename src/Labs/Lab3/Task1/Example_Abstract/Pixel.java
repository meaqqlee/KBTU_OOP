package Labs.Lab3.Task1.Example_Abstract;

import Labs.Lab3.Task1.Example_Abstract.Abstract_classes.Device;

public class Pixel extends Device {
    public int battery;
    private final boolean wireless = true;

    public Pixel(int battery) {
        this.battery = battery;
    }

    public void openCamera() {
        System.out.println("You opened your camera");
    }

    public void closeCamera() {
        System.out.println("You closed your camera");
    }

    @Override
    public boolean isChargeable() {
        return wireless;
    }

    @Override
    public boolean isBatteryFull() {
        return battery == 100;
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }
}
