// package DesignPatterns.Behavioural.COR;

// Abstract Handler
abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handle (String request);
}

// Concrete Handlers
class LoggingHandler extends Handler {
    public void handle (String request) {
        System.out.println("Logging request: " + request);
        if (next != null) next.handle(request);
    }
}

class AuthenticationHandler extends Handler {
    public void handle (String request) {
        if ("validUser".equals(request)) {
            System.out.println("User authenticated");
            if (next != null) next.handle(request);
        } else {
            System.out.println("Authentication failed");
        }
    }   
}

class AuthorizationHandler extends Handler {
    public void handle (String request) {
        if ("validUser".equals(request)) {
            System.out.println("User authorized");
        } else {
            System.out.println("Authorization failed");
        }
    }
}

// Client Code
public class ChainOfResponsibilityDemo {
    public static void main (String[] args) {
        Handler logging = new LoggingHandler();
        Handler auth = new AuthenticationHandler();
        Handler authorization = new AuthorizationHandler();

        logging.setNext(auth);
        auth.setNext(authorization);

        System.out.println("--- Valid User Request ---");
        logging.handle("validUser");

         System.out.println("\n---- Invalid request ----");
        logging.handle("invalidUser");
    }
}
