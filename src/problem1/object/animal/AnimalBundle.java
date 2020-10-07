package problem1.object.animal;

import problem1.object.Animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalBundle {
    private Map<Animal, Integer> animalQuantityMap;

    public AnimalBundle() {
        animalQuantityMap = new HashMap<>();
    }

    public void addAnimalBundle(Animal animal, int quantity) {
        animalQuantityMap.put(animal, quantity);
    }

    public Map<Animal, Integer> getAnimalQuantityMap() {
        return animalQuantityMap;
    }
}
