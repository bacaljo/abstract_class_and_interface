package problem1.object.animal.chicken;

import problem1.object.animal.Chicken;
import problem1.property.AgeGroup;
import problem1.property.Gender;

public class Hen extends Chicken {
    public Hen() {
        super(AgeGroup.ADULT, Gender.FEMALE);
    }
}
