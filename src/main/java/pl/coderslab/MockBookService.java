package pl.coderslab;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;


@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MockBookService {
    private static List<Book> books = new ArrayList<>();

    public MockBookService() {
    }

    public static void addToBooks(Book book) {
        books.add(book);
    }

    public static List<Book> findAllBooks() {
        return books;
    }

    public static Book showBook(Long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public static void removeBook(Long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
            }
        }
        System.out.println("Nie istnieje id");
    }

    public static void updateBook(Book book) {

        for (Book booki : books) {
            if (booki.getId() == book.getId()) {
                booki.setId(book.getId());
                booki.setIsbn(book.getIsbn());
                booki.setTitle(book.getTitle());
                booki.setAuthor(book.getAuthor());
                booki.setPublisher(book.getPublisher());
                booki.setType(book.getType());
                books.add(booki);
            }
        }
    }


    public List<Book> getBooks() {
        return books;
    }
}
