## Introduction
-> used to encapsulate a request as an object.
-> It turns a request (action/operation) into an object.
-> Allows you to parameterize, queue, log, undo/redo requests without hardcoding logic.

Decouples the sender (who issues the request) from the receiver (who executes it).

## Key components
1. Command (interface/ abstract class) -> declares an execute() method
2. ConcreteCommand -> Implements the command interface and defines how the request is carried out.
3. Receiver -> The actual object that performs the action.
4. Invoker -> Calls the command (does not know implementation details)
5. Client -> Creates commands and assigns them to the invoker

## When to Use
-> When you need to decouple sender and receiver.
-> For undo/redo operations (e.g., text editors, Photoshop).
-> For macro recording (batch commands).
-> For task scheduling / job queues.

## Benefits
-> Loose Coupling
-> Easy to add new commands (Open/ Closed Principle)
-> Supports undo/ redo, logging, queuing

Quick note: Think of a TV remote, the remote (invoker) does not knwo how the TV works, it just sends a "command" to the TV (Receiver).

