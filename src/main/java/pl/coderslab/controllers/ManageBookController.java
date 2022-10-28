package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.services.BookService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/books")
public class ManageBookController {

    private final BookService bookService;

    public ManageBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public String allBooks(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "book-list";
    }

    @GetMapping("/{id}")
    public String readBook(@PathVariable Long id, Model model) {
        Optional<Book> book = bookService.get(id);
        if (book.isPresent()) {
            model.addAttribute("book", book.get());
        } else {
            return "book-show";
        }
        return "book-show";
    }


    @GetMapping(value = "/add")
    public String form(Model model) {
        model.addAttribute("book", new Book());
        return "book-form";
    }

    @PostMapping(value = "/add")
    public String submit(@Valid @ModelAttribute Book book, BindingResult result) {
        if (!result.hasErrors()) {
            bookService.add(book);
            return "redirect:/admin/books";
        }
        return "book-form";
    }


    @GetMapping(value = "/delete")
    public String delete(Book book) {
        bookService.delete(book.getId());
        return "redirect:/admin/books";
    }

    @GetMapping(value = "/edit")
    public String editForm(Book book, Model model) {
        model.addAttribute("book", bookService.get(book.getId()).get());
        return "book-edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@Valid Book book, BindingResult result) {
        if (!result.hasErrors()) {
            bookService.update(book);
            return "redirect:/admin/books";
        }
        return "book-edit";
    }


}

