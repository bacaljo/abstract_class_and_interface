package problem1.object.animal;

import problem1.object.Animal;

public class AnimalPrice {
    private Animal animal;
    private double cost;
    private int quantity;

    public AnimalPrice(Animal animal, double cost, int quantity) {
        this.animal = animal;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Animal getAnimal() {
        return animal;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}
