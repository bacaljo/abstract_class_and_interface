package problem2.object;

public abstract class ModeOfTransportation {
    private double cost;

    public ModeOfTransportation(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public abstract String toString();
}
