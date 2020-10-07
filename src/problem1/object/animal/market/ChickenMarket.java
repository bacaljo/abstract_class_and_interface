package problem1.object.animal.market;

import problem1.object.animal.AnimalMarket;
import problem1.object.animal.AnimalPrice;
import problem1.object.animal.chicken.Chick;
import problem1.object.animal.chicken.Cock;
import problem1.object.animal.chicken.Hen;

import java.util.ArrayList;
import java.util.List;

public class ChickenMarket implements AnimalMarket {
    private List<AnimalPrice> animalPriceList;

    public ChickenMarket() {
        animalPriceList = new ArrayList<>();
        animalPriceList.add(new AnimalPrice(new Cock(), 5, 1));
        animalPriceList.add(new AnimalPrice(new Hen(), 3, 1));
        animalPriceList.add(new AnimalPrice(new Chick(), 1, 3));
    }

    @Override
    public List<AnimalPrice> getAnimalPriceList() {
        return animalPriceList;
    }
}
