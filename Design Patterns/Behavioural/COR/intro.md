Lets you pass a request along a chain of handlers until one of them processes it.

Decouples the sender of the request from the receiver(s).

Each handler decides:

Process the request, OR

Pass it to the next handler.

🔹 Structure

Handler (interface/abstract class) → defines handleRequest().

Concrete Handlers → implement logic & decide to handle or forward.

Client → sends request into the chain.

Example: Request Logging → Authentication → Authorization

🔹 Real-World Use Cases

Servlet Filters in Java (logging, auth, compression, etc.)

Spring Interceptors

Exception handling → multiple catch handlers in sequence

Middleware in Express.js / FastAPI

🔹 Benefits

✔️ Loose coupling between sender & receiver
✔️ Open/Closed principle → add new handlers without changing existing ones
✔️ Flexible & reusable handlers