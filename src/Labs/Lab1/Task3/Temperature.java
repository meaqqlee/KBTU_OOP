package Labs.Lab1.Task3;

public class Temperature {
    private double degrees;
    private char scale;

    public static final char CELSIUS = 'C';
    public static final char FAHRENHEIT = 'F';

    public Temperature() {
        this(0, CELSIUS);
    }

    public Temperature(double degrees) {
        this(degrees, CELSIUS);
    }

    public Temperature(double degrees, char scale) {
        this.degrees = degrees;
        this.scale = (scale == CELSIUS || scale == FAHRENHEIT) ? scale : CELSIUS;
    }

    public double getCelsius() {
        if(scale == CELSIUS) {
            return scale;
        }
        else {
            return 5 * (degrees - 32) / 9;
        }
    }

    public double getFahrenheit() {
        if(scale == FAHRENHEIT) {
            return scale;
        }
        else {
            return (9 * degrees / 5) + 32;
        }
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setScale(char scale) {
        if(scale == CELSIUS || scale == FAHRENHEIT) {
            this.scale = scale;
        }
        else {
            System.out.println("it's not standard scale bro.");
        }
    }

    public void setBoth(double degrees, char scale) {
        this.degrees = degrees;
        this.scale = scale;
    }

    public char getScale() {
        return this.scale;
    }
}
