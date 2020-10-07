package problem1.object.animal;

import problem1.object.Animal;
import problem1.property.AgeGroup;
import problem1.property.Gender;

public abstract class Chicken extends Animal {

    public Chicken(AgeGroup ageGroup, Gender gender) {
        super(ageGroup, gender);
    }

    public Chicken(AgeGroup ageGroup) {
        super(ageGroup, null);
    }
}
