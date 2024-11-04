package Labs.Lab2.Task4;

public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    public double getTotalResistance() {
        return 1/((1/this.a.getResistance()) + (1/this.b.getResistance()));
    }

    @Override
    public double getResistance() {
        return 1 / (1 / a.getResistance() + 1 / b.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
