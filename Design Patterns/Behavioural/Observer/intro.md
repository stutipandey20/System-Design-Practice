It’s a behavioral design pattern.

Defines a one-to-many dependency between objects so that when one object (Subject) changes state, all its dependents (Observers) are notified automatically.

Commonly used in event-driven systems, UI frameworks, and publish-subscribe systems.

## 🔹 Key Participants

-> Subject (Publisher): Maintains a list of observers, Provides methods to attach/detach observers, Notifies observers when state changes.

-> Observer (Subscriber): Defines an update method that subjects call when notifying.

-> ConcreteSubject: Holds state and notifies observers on state change. For instance, if a weather station is the subject, specific weather stations in different locations would be concrete subjects.

-> ConcreteObserver: Implements the update logic (what to do when notified). Registered with a concrete subject. For example, a weather app on your smartphone is a concrete observer that reacts to changes from a weather station.

## 🔹 Real-life Analogy

A practical analogy is a YouTube channel notifying its subscribers when a new video is uploaded.

Think of YouTube + Subscribers:

YouTube Channel = Subject

Subscribers = Observers

When the channel uploads a new video, all subscribers are notified automatically.

Another example: Weather app - The Observer Design Pattern provides a flexible and scalable system where adding new devices or weather stations doesn't disrupt the overall communication, providing real-time and location-specific weather updates to users.

## User For:

1. GUI Frameworks like event listeners

2. Messaging Systems (Kafka, JMS - pub/ sub)

3. Model View Controller (MVC) - View observes Model.

4. Realtime notifications (like stock price updates)

## Pros

1. Loose Coupling (subject does not need to know observer details).

2. Easy to add/ remove observers dynamically.

3. Promotes event-driven design.

## Cons

1. Unexpected update order if multiple observers.

2. Can cause memory leaks if observers are not removed.

3. Many observers may cause performance overhead.