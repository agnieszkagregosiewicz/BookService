package pl.coderslab;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService ;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }


    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("")
    public List<Book> allBooks() {
        return bookService.getBooks();
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        bookService.add(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> readBook(@PathVariable Long id) {

        return bookService.get(id);
    }

    @PutMapping ("")
    public void updateIdBook(@RequestBody Book book) {
        bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }

}

