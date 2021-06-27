# Structural Design Pattern
Structural design patterns are used to organize our program into groups. 
This segregation will provide us clarity and gives us easier maintainability. 

## Categories
- Object-Structural patterns: Deals with how objects can be associated and composed to form larger, more complex structures.
- Class-Structural patterns: Deals with abstraction using inheritance and describe how it can be used to provide more useful program interface.

## Design Patterns
- Adapter pattern: Allows us to provide a new interface for a class that already exists, allowing reuse of a class where our client requires a different interface.
- Bridge pattern: Allows us to decouple a class from its interface. This allows the class and its interface to be changed independently over time which can lead to more reuse and less future shock. It also allows us to dynamically switch
between implementations at runtime allowing more runtime flexibility.
- Composite pattern: It allows the client to deal with complex and flexible tree structures. The trees can be built from various types of containers or leaf nodes, and its depth or composition can be adjusted or determined at runtime.
- Decorator pattern: Allows us to dynamically modify an object at runtime by attaching new behaviors, or by modifying existing ones.
- Facade pattern: This pattern allows us to simplify the client by creating a simplified interface for a subsystem.
- Flyweight pattern: This pattern optimizes memory use when we need a design a class with which our client will need to create huge number runtime of objects.
- Proxy pattern: This pattern provides a surrogate object that controls access to some other object. The aim of this pattern is to simplify the client when it needs to use an object that has complications.