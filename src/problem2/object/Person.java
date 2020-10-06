package problem2.object;

import java.util.List;
import java.util.stream.Collectors;

public class Person implements ProblemSolver {
    private String name;
    private double budget;

    public Person(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public List<ModeOfTransportation> chooseAffordableModeOfTransportation(List<ModeOfTransportation> availableModeOfTransportation) {
        return availableModeOfTransportation.stream()
                .filter(modeOfTransportation -> budget >= modeOfTransportation.getCost())
                .collect(Collectors.toList());
    }
}
