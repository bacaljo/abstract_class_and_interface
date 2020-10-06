# Abstract Class and Interface
## Problems
1. One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens. If you want to buy 100 of them with 100 yuan, how should you buy them?
2. From Wuhan to Beijing you can choose from 4 means of transportation, including driving a car, taking bus, train, or plane. Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan. With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?

## Solutions
**GitHub Repository:** https://github.com/bacaljo/abstract_class_and_interface.git
### Transportation Problem
1. Create an abstract class for mode of transportation (`ModeOfTransportation`). It will have a `cost` attribute and a `toString()` abstract method, which will return the display name of the subclass mode. It's `cost` attribute will be private and will only have a getter, so we can only assign its value during instantiation in the constructor.
2. Create concrete classes for the four transportation modes by inheriting `ModeOfTransportation` abstract class (`DrivingACar`, `TakingABus`, `TakingATrain`, `TakingAPlane`). Since we want all instances of each implementations to have a fixed cost, we will assign the cost during the `super()` call in the subclass constructors and not expose a `cost` parameter.
3. Create an interface that will have a `chooseAffordableModeOfTransportation()` method that accepts the list of available `ModeOfTransportation` and returns the list of affordable `ModeOfTransportation` (`ProblemSolver`). This will be implemented by our person object.
4. Create a person class that will have `name` and `budget` as attributes (`Person`) with their respective getters and implement the `ProblemSolver` interface. For the `chooseAffordableModeOfTransportation()` logic, we will return the list of affordable `ModeOfTransportation` by getting those from the list of available `ModeOfTransportation` whose `cost` is less than or equal to the person's `budget`.
5. Create an executable class that will instantiate a person object given the details in the requirements, create a list that will contain all implementations of `ModeOfTransportation` then make the person choose which mode of transportation he/she can afford (`TransportationProblem`).  