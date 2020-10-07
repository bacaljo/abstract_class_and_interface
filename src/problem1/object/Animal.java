package problem1.object;

import problem1.property.AgeGroup;
import problem1.property.Gender;

public abstract class Animal {
    private AgeGroup ageGroup;
    private Gender gender;

    public Animal(AgeGroup ageGroup, Gender gender) {
        this.ageGroup = ageGroup;
        this.gender = gender;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public Gender getGender() {
        return gender;
    }
}
