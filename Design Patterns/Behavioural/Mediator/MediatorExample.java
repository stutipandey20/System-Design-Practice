// package Design Patterns.Behavioural.Mediator;
import java.util.*;

// Mediator interface
interface ChatMediator {
    void showMessage(User user, String message);
}

// Concrete Mediator
class ChatRoom implements ChatMediator {
    public void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "] : " + message);
    }
}

// Colleague class
class User {
    private String name;
    private ChatMediator chatMediator;

    public User (String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        chatMediator.showMessage(this, message);
    }
}

// Client
public class MediatorExample {
    public static void main (String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User emma = new User("Emma", chatRoom);

        john.send("Hello, Emma!");
        emma.send("Hi, John! How are you?");
    }
}
