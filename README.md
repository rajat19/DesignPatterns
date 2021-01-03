# Head First Design Patterns

## Design principles

- Identify the aspects of your application that vary and separate them from what stays the same.
- Program to an interface, not an implementation.
- Favor composition over inheritance.
- Strive for loosely coupled design between objects that interact.
- Classes should be open for extension, but closed for modification.
- Depend upon abstractions. Do not depend upon concrete classes

---
## Design patterns

- **Strategy pattern -** defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently of the client that use it.
- **Observer pattern -** defines a one-to-many dependencies between objects so that when one object changes state, all of its dependents are notified and updated automatically.
- **Decorator pattern -** attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extended functionality.
- **Factory Method -** defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses. 
- **Abstract Factory -** provides an interface for creating families of related or dependent objects without specifying their concrete classes.