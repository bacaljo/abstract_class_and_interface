package problem1.object.buyer;

import problem1.object.animal.AnimalBundle;
import problem1.object.animal.AnimalBuyer;
import problem1.object.animal.AnimalPrice;
import problem1.object.Buyer;

import java.util.ArrayList;
import java.util.List;

public class ChickenBuyer extends Buyer implements AnimalBuyer {
    public ChickenBuyer(double money) {
        super(money);
    }

    @Override
    public List<AnimalBundle> chooseAnimalBundleList(List<AnimalPrice> animalPriceList, int quantity) {
        // Dummy logic
        List<AnimalBundle> animalBundleList = new ArrayList<>();

        for (AnimalPrice animalPrice : animalPriceList) {
            int bundleQuantity = quantity / animalPrice.getQuantity();

            if (animalPrice.getCost() * bundleQuantity <= getMoney()) {
                AnimalBundle animalBundle = new AnimalBundle();
                animalBundle.addAnimalBundle(animalPrice.getAnimal(), bundleQuantity);

                animalBundleList.add(animalBundle);

                break;
            }
        }

        return animalBundleList;
    }
}
