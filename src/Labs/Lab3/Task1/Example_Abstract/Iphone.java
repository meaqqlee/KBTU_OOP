package Labs.Lab3.Task1.Example_Abstract;

import Labs.Lab3.Task1.Example_Abstract.Abstract_classes.Device;

public class Iphone extends Device {
    public int battery;
    private final boolean wireless = true;

    public Iphone(int battery) {
        this.battery = battery;
    }

    public void showMyPhone() {
        System.out.println("You just bragged with your Iphone");
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
