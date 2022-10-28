package pl.coderslab.services;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;
import pl.coderslab.services.BookService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class MockBookService implements BookService {
    private List<Book> books;
    private static Long nextId = 4L;


    public MockBookService() {
        books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming"));
        books.add(new Book(2L, "1234567", "Harry Potter and Philosopher Stone", "J.K.Rowling", "Egmont", "Bestseller"));
        books.add(new Book(3L, "123456789", "Harry Potter and Chamber of Secrets", "J.K.Rowling", "Egmont", "Bestseller"));

    }

    public void add(Book book) {
        book.setId(nextId++);
        books.add(book);
    }

    public Optional<Book> get(Long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return null;
    }
    public void delete(Long id) {
        books.removeIf(book -> (book.getId() == id));
    }

    public void update(Book book) {
        int id = books.indexOf(book.getId());
        books.set(id, book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
