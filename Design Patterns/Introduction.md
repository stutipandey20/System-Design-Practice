1994: 4 folks
Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides
Book name: Design Patterns: Elements of Reusable Object-Oriented Software

-> Introduced 23 design patterns
-> Considered the foundation of object-oriented design best practices.

A design pattern is a reusable solution for common problems in Software design used in engineering.
Works as a framework/ guideline or model. 

Different types of design patterns in JAVA:

# Creational Patterns (Object creation mechanisms)
=> these deal with how objects are created, while hiding the creation logic.

# Structural Patterns (Class and object composition)
=> these deal with how classes and objects are combined to form larger structures while keeping them flexible and efficient.

# Behavioral Patterns (Communication between objects)
=> these deal with how objects interact and communicate, distributing responsibilities efficiently.

## Major different types:

1. Creational Patterns (5)
    -> Singleton - Ensures only one instance of a class exists and provides a global access point.
    -> Factory Method - Defines an interface for creating objects but lets subclasses decide which class to instantiate.
    -> Abstract Factory - Provides an interface for creating families of related/dependent objects without specifying their concrete classes.
    -> Builder Pattern - Separates the construction of a complex object from its representation, allowing step-by-step creation.
    -> Prototype - Creates objects by cloning an existing object (prototype).

2. Structural Patterns (7)
    -> Adapter - Allows incompatible interfaces to work together (a bridge between interfaces).
    -> Bridge - Separates abstraction from implementation so they can vary independently.
    -> Composite - Composes objects into tree structures to represent part-whole hierarchies.
    -> Decorator - Dynamically adds new behavior to objects without modifying their structure.
    -> Facade - Provides a simplified interface to a larger and more complex subsystem.
    -> Flyweight - Reduces memory usage by sharing common objects instead of creating new ones.
    -> Proxy - Provides a placeholder or surrogate to control access to another object.

3. Behavioural Patterns (11)
    -> Chain of responsibilities - Passes requests along a chain of handlers until one handles it.
    -> Command - Encapsulates a request as an object, letting you queue, log, and undo operations.
    -> Interpreter - defines a grammar and Interpreter for a language
    -> Iterator - provides a way to access elements of a collection sequentially without exposing its internals.
    -> Mediator - defines an object that Encapsulates how a set of objects interact (reduce direct dependencies)
    -> Memento - Captures and restores an object’s internal state without violating encapsulation.
    -> Observer - Defines a one-to-many dependency, so when one object changes state, all dependents are notified.
    -> State - Allows an object to alter its behavior when its internal state changes.
    -> Strategy - Defines a family of algorithms, encapsulates them, and makes them interchangeable.
    -> Template Method - Defines the skeleton of an algorithm, deferring some steps to subclasses.
    -> Visitor - Lets you add new operations to existing class hierarchies without modifying them.


✅ Summary:

Creational → Object creation (Singleton, Factory, Builder, Prototype, Abstract Factory).
Structural → Object/class composition (Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy).
Behavioral → Object communication & responsibilities (Observer, Strategy, Command, etc.).
