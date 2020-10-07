package problem1;

import problem1.object.animal.AnimalBundle;
import problem1.object.animal.AnimalBuyer;
import problem1.object.animal.AnimalMarket;
import problem1.object.animal.AnimalPrice;
import problem1.object.animal.market.ChickenMarket;
import problem1.object.buyer.ChickenBuyer;

import java.util.List;

public class ChickenProblem {

    public static void main(String[] args) {
        ChickenBuyer chickenBuyer = new ChickenBuyer(100);
        System.out.println("Chicken Buyer: I want to buy 100 chickens using my " + chickenBuyer.getMoney() + " yuan");
        System.out.println("Chicken Buyer: Let's take a look at the price list of chickens in the market");

        AnimalMarket chickenMarket = new ChickenMarket();
        System.out.println("Chicken Market: Here is our price list:");
        for (AnimalPrice animalPrice : chickenMarket.getAnimalPriceList()) {
            String animalName = animalPrice.getAnimal().getClass().getSimpleName();
            System.out.println("- " + animalPrice.getQuantity() + " " + animalName + "(s) for " + animalPrice.getCost() + " yuan");
        }

        List<AnimalBundle> chickenBundleList = chickenBuyer.chooseAnimalBundleList(
                chickenMarket.getAnimalPriceList(), 100);

        System.out.println("Chicken Buyer: Based on the list, I can buy the ff:");
        for (int i = 0; i < chickenBundleList.size(); i++) {
            AnimalBundle animalBundle = chickenBundleList.get(i);

            System.out.println("Bundle " + (i + 1) + ":");
            animalBundle.getAnimalQuantityMap().forEach((animal, quantity) -> {
                String animalName = animal.getClass().getSimpleName();
                System.out.println("- " + quantity + " " + animalName + "(s)");
            });
        }
    }
}
