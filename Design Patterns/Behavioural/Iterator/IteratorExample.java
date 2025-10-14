import java.util.*;

// Iterator Interface
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Aggregate Interface
interface Collection<T> {
    Iterator<T> createIterator();
}

// Concrete Collection
class BookCollection implements Collection<String> {
    private String[] books = {"Book A", "Book B", "Book C", "Book D"};

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator(books);
    }
}

class BookIterator implements Iterator<String> {
    private String[] books;
    private int index = 0;

    public BookIterator(String[] books) {
        this.books = books; 
    }

    public boolean hasNext() {
        return index < books.length;
    }

    public String next() {
        return hasNext() ? books[index++] : null;
    }
}

// Client code
public class IteratorExample {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        Iterator<String> iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());    
        }
    }
}