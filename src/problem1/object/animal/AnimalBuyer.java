package problem1.object.animal;

import java.util.List;

public interface AnimalBuyer {
    List<AnimalBundle> chooseAnimalBundleList(List<AnimalPrice> animalPriceList, int quantity);
}
