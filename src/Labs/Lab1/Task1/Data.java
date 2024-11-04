package Labs.Lab1.Task1;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        this.sum = 0;
        this.count = 0;
        this.max = Double.NEGATIVE_INFINITY;
    }

    public void add(double value) {
        sum += value;
        count++;
        if (value > max) {
            max = value;
        }
    }

    public double getMax() {
        if(count == 0) {
            return 0;
        }

        return max;
    }

    public double getAvarage() {
        if(count == 0) {
            return 0;
        }

        return max / count;
    }
}
