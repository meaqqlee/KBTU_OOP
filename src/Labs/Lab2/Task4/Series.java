package Labs.Lab2.Task4;

public class Series extends Circuit{
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    public double getResistance() {
        return this.a.getResistance() + this.b.getResistance();
    }

    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    public void applyPotentialDiff(double V) {
        double totalResistance = getResistance();
        a.applyPotentialDiff(V * a.getResistance() / totalResistance);
        b.applyPotentialDiff(V * b.getResistance() / totalResistance);
    }
}
