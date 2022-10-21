package pl.coderslab;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("")
    public List<Book> allBooks() {
        List<Book> books = MockBookService.findAllBooks();
        return books;
    }

    @PostMapping("")
    public void addBook(@RequestParam Book book) {

        MockBookService.addToBooks(book);
    }

    @GetMapping("/{id}")
    public Book readBook(@PathVariable Long id) {

        return MockBookService.showBook(id);
    }

//    @PutMapping Mapping("/{id}")
//    public Book updateIdBook(@PathVariable Long id) {
//
//        return MockBookService.updateBook(id);
//    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        MockBookService.removeBook(id);
    }

}

