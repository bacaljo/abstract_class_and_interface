package problem1.object;

public abstract class Buyer {
    private double money;

    public Buyer(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }
}
