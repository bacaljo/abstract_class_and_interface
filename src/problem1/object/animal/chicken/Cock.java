package problem1.object.animal.chicken;

import problem1.object.animal.Chicken;
import problem1.property.AgeGroup;
import problem1.property.Gender;

public class Cock extends Chicken {
    public Cock() {
        super(AgeGroup.ADULT, Gender.MALE);
    }
}
