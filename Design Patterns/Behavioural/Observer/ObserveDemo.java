// package Design Patterns.Behavioural.Observer;
import java.util.*;

// interface Observer 
interface Observer {
    void update(String message);
}

class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach (Observer observer) {
        observers.add(observer);
    }

    public void detach (Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers (String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class User implements Observer {

    private String name;

    public User (String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

public class ObserveDemo {
    public static void main(String[] args) {
        Subject youtubeChannel = new Subject();

        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        youtubeChannel.attach(user1);
        youtubeChannel.attach(user2);
        
        youtubeChannel.notifyObservers("New Video Uploaded");
        youtubeChannel.detach(user1);

        youtubeChannel.notifyObservers("Live Streaming starting now!");
    }
}
