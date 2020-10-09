package problem1.object.animal;

import problem1.object.Animal;

import java.util.LinkedHashMap;
import java.util.Map;

public class AnimalBundle {
    private Map<Animal, Integer> animalQuantityMap;

    public AnimalBundle() {
        animalQuantityMap = new LinkedHashMap<>();
    }

    public void addAnimalBundle(Animal animal, int quantity) {
        animalQuantityMap.put(animal, quantity);
    }

    public Map<Animal, Integer> getAnimalQuantityMap() {
        return animalQuantityMap;
    }
}
