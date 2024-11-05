package Labs.Lab3.Task1.Example_Abstract;

import Labs.Lab3.Task1.Example_Abstract.Abstract_classes.Device;

public class Computer extends Device {
    private final boolean wireless = false;
    private boolean isComputerOn;

    public Computer(boolean isComputerOff) {
        this.isComputerOn = isComputerOff;
    }

    public void TurnOn() {
        isComputerOn = true;
        System.out.println("Now Your computer turned on");
    }
    public void TurnOff() {
        isComputerOn = false;
        System.out.println("Now Your computer turned off");
    }

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
