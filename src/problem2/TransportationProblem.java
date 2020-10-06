package problem2;

import problem2.object.ModeOfTransportation;
import problem2.object.Person;
import problem2.object.modeoftransportation.DrivingACar;
import problem2.object.modeoftransportation.TakingABus;
import problem2.object.modeoftransportation.TakingAPlane;
import problem2.object.modeoftransportation.TakingATrain;

import java.util.ArrayList;
import java.util.List;

public class TransportationProblem {

    public static void main(String[] args) {
        Person xiaoming = new Person("Xiaoming", 500);
        System.out.println(xiaoming.getName() + ": I plan to go to Beijing from here (Wuhan) and I have a budget of " + xiaoming.getBudget() + " CNY for transporation");

        List<ModeOfTransportation> availableModeOfTransportationList = new ArrayList<>();
        availableModeOfTransportationList.add(new DrivingACar());
        availableModeOfTransportationList.add(new TakingABus());
        availableModeOfTransportationList.add(new TakingATrain());
        availableModeOfTransportationList.add(new TakingAPlane());

        System.out.println(xiaoming.getName() + ": The only available modes of transportation are:");
        for (ModeOfTransportation modeOfTransportation : availableModeOfTransportationList) {
            System.out.println("- " + modeOfTransportation.toString() + " (costs " + modeOfTransportation.getCost() + " CNY)");
        }

        System.out.println(xiaoming.getName() + ": Since I have " + xiaoming.getBudget() + " CNY, I can only afford the ff:");
        List<ModeOfTransportation> affordableModeOfTransportationList = xiaoming.chooseAffordableModeOfTransportation(availableModeOfTransportationList);
        for (ModeOfTransportation modeOfTransportation : affordableModeOfTransportationList) {
            System.out.println("- " + modeOfTransportation.toString());
        }
    }
}
