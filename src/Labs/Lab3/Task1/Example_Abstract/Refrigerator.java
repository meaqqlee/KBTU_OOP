package Labs.Lab3.Task1.Example_Abstract;

import Labs.Lab3.Task1.Example_Abstract.Abstract_classes.Device;

public class Refrigerator extends Device {
    private final boolean wireless = false;

    @Override
    public boolean isChargeable() {
        return wireless;
    }

    @Override
    public boolean isBatteryFull() {
        return true;
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }
}