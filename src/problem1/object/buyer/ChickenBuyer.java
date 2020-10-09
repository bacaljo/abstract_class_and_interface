package problem1.object.buyer;

import problem1.object.Buyer;
import problem1.object.animal.AnimalBundle;
import problem1.object.animal.AnimalBuyer;
import problem1.object.animal.AnimalPrice;

import java.util.ArrayList;
import java.util.List;

public class ChickenBuyer extends Buyer implements AnimalBuyer {
    public ChickenBuyer(double money) {
        super(money);
    }

    @Override
    public List<AnimalBundle> chooseAnimalBundleList(List<AnimalPrice> animalPriceList, int quantity) {
        List<AnimalBundle> animalBundleList = new ArrayList<>();

        boolean trialIsNotYetCompleted = true;
        int[] trialQuantities = new int[animalPriceList.size()];
        while (trialIsNotYetCompleted) {
            for (int i = 0; i < trialQuantities.length; i++) {
                trialQuantities[i]++;
                if (trialQuantities[i] < quantity) {
                    break;
                }
                trialQuantities[i] = 0;
            }

            double totalCost = 0;
            int totalQuantity = 0;
            for (int i = 0; i < animalPriceList.size(); i++) {
                AnimalPrice animalPrice = animalPriceList.get(i);

                totalCost += animalPrice.getCost() * trialQuantities[i];
                totalQuantity += animalPrice.getQuantity() * trialQuantities[i];
            }

            if (totalCost == getMoney() && totalQuantity == quantity) {
                AnimalBundle animalBundle = new AnimalBundle();
                for (int i = 0; i < animalPriceList.size(); i++) {
                    AnimalPrice animalPrice = animalPriceList.get(i);
                    int animalQuantity = animalPrice.getQuantity() * trialQuantities[i];

                    animalBundle.addAnimalBundle(animalPrice.getAnimal(), animalQuantity);
                }
                animalBundleList.add(animalBundle);
            }

            if (totalQuantity >= quantity * trialQuantities.length) {
                trialIsNotYetCompleted = false;
            }
        }

        return animalBundleList;
    }
}
