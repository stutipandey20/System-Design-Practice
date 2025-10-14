## Introduction

The Mediator Design Pattern is a behavioral design pattern that helps reduce direct dependencies between communicating objects.
Instead of objects referring to and calling each other directly, they communicate through a central mediator.
It defines an object that encapsulates how a set of objects interact.
It promotes loose coupling by preventing objects from referring to each other explicitly.

## real life use cases

=> A group project in a class (Students, Teacher)
=> A chat room/ chat applications
=> Air Traffic control

## Key participants

Mediator (interface)	    Declares the communication methods used by colleague objects.
ConcreteMediator	        Implements how the communication happens between colleague objects.
Colleague (interface/class)	Objects that interact via the mediator.
ConcreteColleague	        Implements the actual objects that send/receive messages via the mediator.

## Pros / Cons

Advantages
Promotes loose coupling (colleagues don’t depend on each other).
Simplifies object interconnections.
Centralizes control and communication logic.
Easier maintenance and scalability.

Disadvantages

The Mediator itself can become complex if it handles too much logic.
Can turn into a “God Object” if not carefully designed.