## Introduction

The Memento Design Pattern is a behavioral design pattern that lets you capture and store an object’s internal state so it can be restored later — without exposing its internal implementation details.'


## Purpose

Think of it like an undo/redo feature — it allows rolling back to a previous state without breaking encapsulation.


## Key Participants
Role	            Responsibility

Originator	        The object whose state needs to be saved or restored.

Memento	            Stores the internal state of the Originator; it’s immutable once created.

Caretaker	        Manages saved mementos (e.g., stores history, handles undo/redo).


## Example

Text editors (undo/redo feature)

Video games (save game progress)

IDEs or drawing apps (history management)

Transaction systems (rollback functionality)


## Advantages

Provides undo/redo functionality.

Maintains encapsulation (doesn’t expose internal state).

Makes state management cleaner and reusable.


## Drawbacks

Storing many mementos can lead to high memory usage.

The Caretaker must manage the lifecycle of mementos carefully.