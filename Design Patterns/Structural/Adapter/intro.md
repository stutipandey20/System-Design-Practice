-> Two incompatible interfaces or systems can cooperate by using the adapter design pattern, a structural design pattern. 
-> Because of incompatible interfaces, it serves as a bridge between two classes that would not otherwise be able to communicate. 
-> The adapter approach is very helpful when attempting to incorporate third-party libraries or legacy code into a new system.

Convert the interface of a class into another interface that clients expect.
It allows incompatible classes to work together without changing their source code.

## Analogy
Think of a power adapter:
Your laptop charger expects a 3-pin socket, but the wall has a 2-pin outlet.
Instead of replacing your charger or the wall socket, you use an adapter in between.
Both work together seamlessly.

## When to Use
You have a class that offers the functionality you need, but its interface is incompatible.
You want to reuse existing code without modifying it.
Integrating with legacy systems.

## Types of Adapters
Class Adapter (uses inheritance) – not always possible in Java (since it doesn’t support multiple inheritance).
Object Adapter (uses composition) – more common in Java.