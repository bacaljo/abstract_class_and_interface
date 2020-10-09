# Abstract Class and Interface
## Problems
1. One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens. If you want to buy 100 of them with 100 yuan, how should you buy them?
2. From Wuhan to Beijing you can choose from 4 means of transportation, including driving a car, taking bus, train, or plane. Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan. With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?

## Solutions
**GitHub Repository:** https://github.com/bacaljo/abstract_class_and_interface.git
### Chicken Problem
1. Create an `Animal` and `Chicken` abstract classes that will have age group and gender as attributes.
2. Create concrete classes for the three chickens by inheriting `Chicken` abstract class (`Cock`, `Hen`, `Chick`). These classes will not expose any parameters in their constructors so that their age groups and genders will not be modifiable outside the class.
3. Create market-related classes and interfaces that will handle the listing and association of animals with their prices and quantities (`AnimalPrice`, `AnimalMarket`, `Animal Bundle`).
4. Create a concrete class for the chicken market by inheriting `AnimalMarket` interface. This class will contain the price list of the chickens.
5. Create an abstract class for our buyer object which will have money as attribute (`Buyer`).
6. Create an interface that will contain the method to choose all possible animal combination whose total matches the given quantity, base on an animal price list (`AnimalBuyer`). 
7. Create a concrete class for the chicken buyer by inheriting `Buyer` abstract class. This will implement the `AnimalBuyer` interface so that it can have the ability to choose animal bundles, specifically chickens, by providing its own implementation.
8. Update the logic of `ChickenBuyer.chooseAnimalBundleList()` to perform trial and error until it extracts all possible chicken combinations that satisfy the requirements. 

### Transportation Problem
1. Create an abstract class for mode of transportation (`ModeOfTransportation`). It will have a `cost` attribute and a `toString()` abstract method, which will return the display name of the subclass mode. It's `cost` attribute will be private and will only have a getter, so we can only assign its value during instantiation in the constructor.
2. Create concrete classes for the four transportation modes by inheriting `ModeOfTransportation` abstract class (`DrivingACar`, `TakingABus`, `TakingATrain`, `TakingAPlane`). Since we want all instances of each implementations to have a fixed cost, we will assign the cost during the `super()` call in the subclass constructors and not expose a `cost` parameter.
3. Create an interface that will have a `chooseAffordableModeOfTransportation()` method that accepts the list of available `ModeOfTransportation` and returns the list of affordable `ModeOfTransportation` (`ProblemSolver`). This will be implemented by our person object.
4. Create a person class that will have `name` and `budget` as attributes (`Person`) with their respective getters and implement the `ProblemSolver` interface. For the `chooseAffordableModeOfTransportation()` logic, we will return the list of affordable `ModeOfTransportation` by getting those from the list of available `ModeOfTransportation` whose `cost` is less than or equal to the person's `budget`.
5. Create an executable class that will instantiate a person object given the details in the requirements, create a list that will contain all implementations of `ModeOfTransportation` then make the person choose which mode of transportation he/she can afford (`TransportationProblem`).  